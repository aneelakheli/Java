public class SwitchOperator {
    public static void main(String[] args) {
        int months = 8;
        String monthname;
        switch (months) {
            case 1:
                monthname = "Janauray";
                break;
            case 2:
                monthname = "February";
                break;
            case 3:
                monthname = "March";
                break;
            case 4:
                monthname = "April";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname = "September";
                break;
            case 10:
                monthname = "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
                break;
            default:
                monthname = " invalid months name";
        }
        System.out.println("The month name is " + monthname);
    }

}
