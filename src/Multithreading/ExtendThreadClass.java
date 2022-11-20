// package src.Multithreading;

class Multithread extends Thread {
	private Thread t;
	private String threadName;
	Multithread(String name){
		threadName = name;
		System.out.println("Creating "+ threadName);
	}

	public void run() {
		System.out.println("Running "+ threadName);
		try {
			for(int i=4; i>0;i++){
			System.out.println("Thread " + threadName + " is running");
			Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName+" Interrupted.");
		}
		System.out.println("Thread "+ threadName+" exiting.");
	}
	public void start(){
		System.out.println("Starting "+threadName);
		if(t==null){
			t = new Thread(this,threadName);
			t.start();
		}
	}
}

public class ExtendThreadClass {
	public static void main(String args[]) {
		// int n = 8;
		// for (int i = 0; i < n; i++) {
		// 	Multithread thread = new Multithread();
		// 	thread.start();
		// }
		Multithread T1 = new Multithread("Thread-1");
		T1.start();
		Multithread T2 = new Multithread("Thread-2");
		T2.start();

	}

}
