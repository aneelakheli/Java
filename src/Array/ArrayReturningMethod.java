public class ArrayReturningMethod {
    
    static void reverse(int arrayInt[]){
    int[] newArrayInt = new int[arrayInt.length];
    int j = arrayInt.length;
    for(int i=0;i<arrayInt.length;i++){
        newArrayInt[j-1]= arrayInt [i];
        j = j-1;
    }
    System.out.println("Reverse array is: \n");
    for(int k=0;k<arrayInt.length;k++){
        System.out.print(newArrayInt[k]);
    }
}
    // public static void printArray(int[] arrayInt){
    //     for(int i= 0; i<arrayInt.length; i++){
    //         System.out.print(arrayInt[i]+ " ");
    //     }
    // }
    // public static int[] reverse(int[] arrayInt){
    //     int[] result = new int[arrayInt.length];
    //     for(int i=0, j=result.length-1; i<arrayInt.length; i++, j--){
    //         result[j] = arrayInt[i];
            
    //     }
    //     return result;
    // }
    public static void main(String[] args){
        int[] arrayInt = {1,2,3,4,5,6,7,8,9};
        // printArray(arrayInt);
        // System.out.println(reverse(arrayInt));
        reverse(arrayInt);


    }
}
