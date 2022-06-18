public class CallByValueExample {
    static int data =90;
    static int change(int data){
       return data = data +100;
    }
    public static void main(String[] args) {
        System.out.println("Before change "+ data);
        System.out.println("After change "+ change(900));

    }
    
}
