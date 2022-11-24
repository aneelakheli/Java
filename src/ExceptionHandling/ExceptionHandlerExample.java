import java.io.*;

public class ExceptionHandlerExample{
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: "+ a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Exception thrown: "+e);
        }
        System.out.println("Out of the Block");
    }
}