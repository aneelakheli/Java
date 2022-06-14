class ExecutionArray  {
    public int roll_no;
    public String name;
    ExecutionArray(int roll_no, String name){
        this.roll_no= roll_no;
        this.name = name;
    }
    
}

public class StudentArrayExe{
    public static void main(String[] args) {
        ExecutionArray[] arr = new ExecutionArray[6];
        arr[0]= new ExecutionArray(1, "Aman");
        arr[1]= new ExecutionArray(2, "Amrit");
        arr[2]= new ExecutionArray(3, "Akash");
        arr[3]= new ExecutionArray(4, "Akanshya");
        arr[4]= new ExecutionArray(5, "Amrita");
        arr[5]= new ExecutionArray(6, "Amita");
        for( int i =0; i<arr.length; i++){
            System.out.println("Element at "+ i + " : "+ arr[i].roll_no + " "+ arr[i].name);
        }
    }
}