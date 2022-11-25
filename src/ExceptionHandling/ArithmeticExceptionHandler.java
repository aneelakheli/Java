
public class ArithmeticExceptionHandler {
public static void main(String[] args) {
    try {

        // code that generate exception
        int divideByZero = 5 / 0;
        System.out.println("Rest of code in try block");
      }
      
      catch (ArithmeticException e) {
        System.out.println("Error ArithmeticException => " + e.getMessage());
      }
    }    
}
