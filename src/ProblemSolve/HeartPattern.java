public class HeartPattern {
    public static void main(String[] args){
        int size =7;
        int alpha= 65;
        for(int i=size/2; i<size; i+=2){
            for(int j = 1;j<size-i;j+=2){
                System.out.print(" ");
            }
            for(int j =1;j<i+1;j++){
                System.out.print((char)(alpha+j-1));
            }
            for(int j =1;j<size-i+1;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<i+1;j++){
                System.out.print((char)(alpha + j-1));
            }
            System.out.println();
        }
        // inverted pyramid
        for(int i =size;i>0;i--){
            for(int j =0;j<size-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<i*2;j++){
                System.out.print((char)(alpha+j-1));
            }
            System.out.println();
        }

    }
    
}
