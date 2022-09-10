public class MaxStringCount {

    public static char getCountValue(String str){

        int count[] = new int[256];
        int len = str.length();
        int max = -1;
        char result = ' ';

        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result  = str.charAt(i);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String str = "Programming langauage";
        System.out.println(getCountValue(str));
    }
}
