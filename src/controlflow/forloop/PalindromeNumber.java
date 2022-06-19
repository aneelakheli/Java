package forloop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        int remainder;
        for (; number > 0;) {
            remainder = number % 10;
            System.out.println(remainder);
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("Yes, it's palindrome");
        } else {
            System.out.println("NO, it's not palindrome");
        }

    }
}
