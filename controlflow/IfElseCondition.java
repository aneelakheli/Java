public class IfElseCondition {
    public static void main(String[] args) {
        float principle = 9000;
        float rate = 10;
        float years = 9;
        if (years > 5) {
            rate -= 2;
            int interest = (int) (principle * rate * years) / 100;
            System.out.println("The interest is " + interest);
        } else {
            int interest = (int) (principle * rate * years) / 100;
            System.out.println("The interest is " + interest);
        }

        String city = "Kathmandu";
        if (city == "Kathmandu") {
            System.out.println("The capital city of Nepal");
        } else {
            System.out.println("The city is Somewhere.");
        }
    }

}
