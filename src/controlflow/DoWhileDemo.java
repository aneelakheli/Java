import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        do {
            System.out.println("Enter the Number:");
            num = sc.nextInt();
            if (num >= 0) {
                sum += num;
            }
        } while (num >= 0);

        System.out.println(sum);
    }
}