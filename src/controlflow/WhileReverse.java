import java.util.Scanner;

public class WhileReverse {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainder;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = 10 * reverse + remainder;
            number = number / 10;
        }
        System.out.println(reverse);

    }
}
