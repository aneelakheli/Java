public class ArrayMultiplyExample {
    
    static void multiplyArray(int arrayValue[][]){
        int[][] multInt = new int[arrayValue.length][arrayValue.length];
        for(int i=0;i<arrayValue.length;i++){
            for(int j=0; j<arrayValue.length;j++){
                multInt[i][j] = 0;
                for(int k=0; k<arrayValue.length;k++){
                multInt[i][j]+= arrayValue[i][k]*arrayValue[k][j];
                }
                System.out.print(multInt[i][j]+ " ");
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args){
        int[][] arrayInt = {{1,2,3,},{2,3,4},{5,6,7}};
        multiplyArray(arrayInt);
       
    }
}
