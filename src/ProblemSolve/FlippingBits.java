import java.util.Scanner.*;

public class FlippingBits {
    public static void main(String[] args) {
        flippingBits(1);
    }

    public static long flippingBits(long n) {
        long number;
        long unsignedNumber=4294967295L;
        
        for (int i = 0; i < n; i++) {
          if(n ==0){
            return unsignedNumber;
          }
            number = (long)n;
            number = ~number;
            unsignedNumber = number & 0xffffffffL;
            // return unsignedNumber;
            // System.out.println(unsignedNumber
        }
    
        return unsignedNumber;
    }

}