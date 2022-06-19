import java.time.Month;

public class SwitchDemo {
    public static void main(String[] args) {
        int years = 3000;
        int month = 2;
        int numDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDay = 30;
                break;
            case 2:
                if (((years % 4 == 0) && !(years % 100 == 0)) || (years % 400 == 0)) {
                    numDay = 29;
                    break;
                } else {
                    numDay = 28;
                    break;
                }
            default:
                System.out.println("invalid months");
                break;

        }
        System.out.println(numDay);
    }

}
