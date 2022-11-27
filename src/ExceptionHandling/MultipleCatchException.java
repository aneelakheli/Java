public class MultipleCatchException {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            // a[5] = 30/0;
            System.out.println(a[6]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndex out of bounds exception");
        }catch(Exception e){
            System.out.println("Parent exception occurs.");
        }
        System.out.println("Rest of code");
    }
    
}
