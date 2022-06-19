public class SwitchExample {
    public static void main(String[] args) {
        String days = "Friday";
        int numDay = 0;

        switch (days) {
            case "Sunday":
                numDay = 1;
                break;
            case "Monday":
                numDay = 2;
                break;
            case "Tuesday":
                numDay = 3;
                break;
            case "Wednesday":
                numDay = 4;
                break;
            case "Thursday":
                numDay = 5;
                break;
            case "Friday":
                numDay = 6;
            case "Saturday":
                numDay = 7;
                break;
            default:
                System.out.println("Invalid Day name");
        }
        System.out.println(numDay);
    }

}
