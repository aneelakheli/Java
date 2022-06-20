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
        Pattern emailValidation = Pattern.compile(EMAILREGEX);
        System.out.println("Enter the email");
        boolean emailMatcher = emailValidation.matcher(sc.nextLine()).matches();

        // System.out.println("Enter the phone");
        // String PHONEREGEX = "[98][0-9]{10}";
        // Pattern numValidator = Pattern.compile(PHONEREGEX);
        // boolean phoneMatcher = numValidator.matcher(sc.nextLine()).matches();
        // numValidator.matcher(email).matches();
        if(emailMatcher ){
            System.out.println("match found for regex");
        }else{
            System.out.println("No match found for Regex");
        }
        // Pattern phoneValidation = Pattern.compile(PHONEREGEX);
        // Matcher emailMatcher = emailValiation.matcher(sc.nextLine());
        // Matcher phoneMatcher = phoneValidation.matcher(sc.nextLine());
        // boolean accepted = Pattern.matches(REGEX, emailMatcher);

        // while (phoneMatcher.find() && emailMatcher.find()){

        // }


    }
}
