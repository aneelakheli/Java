import java.util.Arrays;
public class CopyArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int[] copyNumbers = new int[6];

        // //copying array using assignment number.
        // int[] copyNumbers = numbers;
        // for(int num: copyNumbers){
        //     System.out.println(num + " ");
        // }

        //iterate and copy elements from source to destination
        for(int i=0;i<numbers.length;i++){
            copyNumbers[i] = numbers[i];
            // System.out.println(copyNumbers[i]);
        }
        System.out.println(Arrays.toString(copyNumbers));
        // System.out.println(copyNumbers[i]);
    }
    
}
