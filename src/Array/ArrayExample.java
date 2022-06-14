public class ArrayExample {
    public static void main(String[] args) {
        //declaring an array of integers.
        int[] arr;
        arr = new int[]{1,2,3,4,5};
        for(int i =0; i<arr.length;i++){
            System.out.println("Element at index " + i + " : "+ arr[i]);
        }
    }
    
}
