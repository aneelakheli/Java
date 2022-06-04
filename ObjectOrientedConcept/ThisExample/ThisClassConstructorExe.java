package ObjectOrientedConcept.ThisExample;

public class ThisClassConstructorExe {
    int num1;
    int num2, sum;

    // default constructor
    ThisClassConstructorExe() {
        this(10, 20);
        sum = num1 - num2;
        System.out.println("Inside Default Constructor " + sum + "\n");
    }

    // Parameterized constructor
    ThisClassConstructorExe(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sum = num1 + num2;
        System.out.println("Inside Parameterized constructor " + sum);
    }

    public static void main(String[] args) {
        ThisClassConstructorExe object = new ThisClassConstructorExe();
    }
}
