import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExampleone{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("world is comming ");
        boolean matchFounder = matcher.find();
        if(matchFounder){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}