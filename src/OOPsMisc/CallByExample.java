public class CallByExample {
    public static void main(String[] args) {
        IntWrapper a= new IntWrapper(50);
        IntWrapper b = new IntWrapper(90);
        System.out.println("Before Swapping,a = "+ a.a+ " and b ="+b.a);
        swapFunction(a,b);
        System.out.println("\n Before and After swapping value will be different here: ");
        System.out.println("After swapping,a= "+ a.a + " and b is " +b.a);
        }
        public static void swapFunction(IntWrapper a, IntWrapper b){
            System.out.println("Before swapping(Inside),a =" + a.a +" b = "+b.a  );
            IntWrapper c = new IntWrapper(a.a);
            a.a = b.a;
            b.a = c.a;
            System.out.println("After swapping(Inside),a =" + a.a +" b = "+b.a  );
        }
}
class IntWrapper{
    public int a;
    public IntWrapper( int a){
        this.a = a;
    }
}
