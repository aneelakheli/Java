// a program to illustrate 
// how we can print an array of different type using single generic methods.

public class GenericMethodExample {
    //generics method
    public static <E>  void printArray(E[] inputArray){
        for( E element:inputArray){
            System.out.printf("%s", element);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        //creating array of integer, double and characters
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
        Character[] charArray = {'A','B','C','D'};
        System.out.println("Array contains Integer Array:");
        printArray(intArray);
        System.out.println("Array contains Integer double:");
        printArray(doubleArray);
        System.out.println("Array contains Integer Character:");
        printArray(charArray);
    }

}
