
public class HourGlassPattern {
    public static void main(String[] args){
        int size =5 ;
        int alpha = 65;
        //for reverse pyramid  
        for(int i =0;i<size;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<(size-i)*2-1;k++){
                System.out.print((char)(alpha+k));
            }
            System.out.println();
        }
        //for pyramid
        for(int i=2;i<=size;i++){
            for(int j =size;j>i;j--){
                System.out.print( " ");
            }
            for(int k =0;k<i*2-1;k++){
                System.out.print((char)(alpha+k));
            }
        System.out.println();
        }
    }
    
}
