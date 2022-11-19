public class ExtendRunnableInterface {
    public static void main(String[] args) {
        ThreadJava tj1 = new  ThreadJava("Thread-1");
        tj1.run();

        ThreadJava tj2 = new ThreadJava("Thread-2");
        tj2.run();
        
    }
    
}

class ThreadJava implements Runnable{
    private Thread t;
    private String threadName;
    public ThreadJava(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    public void run(){
        System.out.println("Running " +threadName);
        try {
            for(int i=4;i>0;i--){
                System.out.println("Thread: " +threadName + ", " +i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread " + threadName + " Interrupted.");
        }
        System.out.println("Thread " + threadName+ " executing. ");
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}