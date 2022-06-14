//java program to demonstrate passing of array to method.


public class ArrayPassOnMethodExample {
    //driver method.
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,2,1};
        sum(arr);      
    }
    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum of array values : "+sum);
    }
    
}
