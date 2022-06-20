import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class EmailAndPasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String EMAILREGEX = "^[a-zA-Z0-9_+&*-]+(?:\\."+
        "[a-zA-Z0-9_+&*-]+)*@" +
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
        "A-Z]{2,7}$";
        System.out.println("Enter the email");
        Pattern emailValidation = Pattern.compile(EMAILREGEX);
        boolean emailMatcher = emailValidation.matcher(sc.nextLine()).matches();

        System.out.println("Enter the phone");
        String PHONEREGEX = "^\\d{10}$";
        Pattern numValidator = Pattern.compile(PHONEREGEX);
        boolean phoneMatcher = numValidator.matcher(sc.nextLine()).matches();
        if(emailMatcher ){
            System.out.println("match found for regex");
        }else{
            System.out.println("No match found for Regex");
        }
        if(phoneMatcher ){
            System.out.println("match found for regex");
        }else{
            System.out.println("No match found for Regex");
        }

    }
}
