public class NestedExceptionBlocked{
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Divided by 0.");
                int b = 90/0;
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception.(First Inner try block.)");
            }
        
        
        try{
            int num[] = new int[5];
            num[5] = 45;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOFBoundsException. (Second Inner try Blocked).");
        }
    }
    catch(Exception e){
        System.out.println("Exception in outer Bounds");
    }
    }
}