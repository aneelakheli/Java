package forloop;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number\n");
        Scanner sc = new Scanner(System.in);
        int sq;
        int num = sc.nextInt();
        int sunnyNumber = num + 1;
        for (int i = 2; i <= sunnyNumber / 2; i++) {
            if (sunnyNumber / i == i) {
                System.out.println("the Given number " + num + " is Sunny number");
                break;
            } else {
                System.out.println(" Not a Sunny number");
            }
        }
    }
}
