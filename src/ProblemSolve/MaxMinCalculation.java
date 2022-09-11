import java.util.*;

public class MaxMinCalculation {

    public static void main(String[] args) {
      MaxMinCalculation main = new MaxMinCalculation();
      int[] arr = {1,2,3,4,5};
      arr = main.calculationMaxMin(arr);
      for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+ "\n");  
      }
      
  }
  public int[] calculationMaxMin(int arr[]){
    // for(int i=0;i<arr.length;i++){
    //     for(int j=1;j<ar)
    // }
    int minTotal=0; 
    int maxTotal=0;
    for(int i =0;i<arr.length-1;i++){
      minTotal = minTotal + arr[i];
    }
    for(int i=1;i<arr.length;i++){
      maxTotal+=arr[i];
    }
    int[] result = { minTotal, maxTotal};
    return result;
  }
}