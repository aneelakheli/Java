/* 
Created by Anil Akheli
java program for nested if .
*/
public class NestedIF {
    public static void main(String[] args) {
        int age = 10;
        int weight = 90;
        if (age > 18) {
            if (weight > 65) {
                System.out.println("You are eligible to donate Blood");
            } else {
                System.out.println("You are not eligible to donate Blood");
            }
        } else {
            System.out.println("You Must be 18 years old");
        }

    }

}
