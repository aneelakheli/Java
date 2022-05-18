import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number = sc.nextInt();
        int calcu = number;
        while (calcu > 0) {

            int factorial = 1;
            int num = calcu % 10;
            System.out.println(num);
            for (int i = 1; i <= num; i++) {
                factorial = i * factorial;
            }
            sum = sum + factorial;
            calcu = calcu / 10;

        }
        if (sum == number) {
            System.out.println("yes..");
        } else {
            System.out.println("NO...");
        }

    }
}
