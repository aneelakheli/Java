public class TestExceptionPropagation {
    void exceptionGenerate(){
        int num = 90/0;
    }    
    void exceptionTaken(){
        exceptionGenerate();
    }
    void mainException(){
        try {
            exceptionTaken();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception handled... in stack.");
        }

    }
    public static void main(String[] args) {
        TestExceptionPropagation exception = new TestExceptionPropagation();
        exception.mainException();
        System.out.println("Normal flow");
    }
}
