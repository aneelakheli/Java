public class SecondLargestArray {
 public static void main(String[] args) {
    int[] array = new int[] {34,32,145,89,67,100};
    int largestNum = array[0];
    for(int i =0;i<array.length;i++){
        if(largestNum<array[i]){
            largestNum = array[i];
            System.out.println(largestNum);
        }
    }
    int  secondLargest=0 ;
    for(int i =0;i<array.length;i++){
        if(secondLargest<array[i] && array[i]!= largestNum){
            secondLargest = array[i];
        }

    }
System.out.println(secondLargest);
 }   
}
