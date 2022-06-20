import java.util.regex.*;

public class PatternCompilerExample {
    public static void main(String[] args) {
        String REGEX =".*www.*";
        String actualString = "www.onlinekhabar.com";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher =  pattern.matcher(actualString);
        boolean matches = pattern.matcher(actualString).matches();
        System.out.println("actual string "+ "contains REGEX =" +matches);
    }
}
