import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        while (number > 0) {
            int factorial = 1;
            int num = number % 10;
            for (int i = 1; i <= num; i++) {
                factorial = i * factorial;
            }
            sum = sum + factorial;
            number = number / 10;
        }
        if (sum == number) {
            System.out.println("The given number is Peterson.");
        } else {
            System.out.println("The given number is not Peterson");
        }
    }
}
