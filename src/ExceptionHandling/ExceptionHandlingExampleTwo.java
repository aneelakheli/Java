import java.io.*;

public class ExceptionHandlingExampleTwo {
    public static void main(String[] args) {
        String  name= null;
        try {
            //code that generate exception
            if(name.equals("something")){
                System.out.println("Same");
            }
            else{
                System.out.println("Not same");
            }
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception => "+ e.getMessage());
        }
        finally{
            System.out.println("Finally printed..Thank you");
        }
    }
}
