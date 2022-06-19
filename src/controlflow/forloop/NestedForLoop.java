package forloop;

public class NestedForLoop {
    public static void main(String[] args) {
        // Loop of i
        for (int i = 1; i <= 3; i++) {
            // loop of j
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            } // end of j
        } // end of i
    }

}
