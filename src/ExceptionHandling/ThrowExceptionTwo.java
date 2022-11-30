import java.io.*;

public class ThrowExceptionTwo {
    public static void throwCheck() throws FileNotFoundException {
        FileReader file = new  FileReader("D:\\PraticeWeb\\Java\\src\\example.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new  FileNotFoundException();
    }
public static void main(String[] args) {
    try {
        throwCheck();
    } catch (FileNotFoundException e) {
        // TODO: handle exception
        // System.out.println("File not Foundexception Throw");
        e.printStackTrace();
    }
    System.out.println("Something Wrong..");
}

}
