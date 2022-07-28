public class BirthdayCakeCandle{
    public static void main(String[] args) {
        int count =0;
        int[] candle = new int[]{4,4,5,6,7,2,5,7,9,2,9,9,2,2,3};
        int maxHeight =candle[0];
        for(int i =0;i<candle.length;i++){
            if(maxHeight<candle[i]){
                maxHeight=candle[i];
            }
        }
        for(int i =0; i<candle.length;i++){
            if(maxHeight==candle[i]){
                count++;
            }
        }
        System.out.print(count);
    }
    
}