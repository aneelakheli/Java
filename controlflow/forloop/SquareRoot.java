package forloop;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num / i == i) {
                System.out.println("the number is square");
                break;

            }
        }
    }
}