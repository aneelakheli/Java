import java.io.IOException;

public class ThrowsExceptionKeyword {
    void throwException() throws IOException{
        throw new IOException("Device Error...");
    }
    void mainException() throws IOException{
        throwException();
    }
    void exceptionCollection(){
        try {
            mainException();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handler..");
        }
    }
    public static void main(String[] args) {
        ThrowsExceptionKeyword objectException = new ThrowsExceptionKeyword();
        objectException.exceptionCollection();
        System.out.println("Exception Handling at all...");
    }
}
