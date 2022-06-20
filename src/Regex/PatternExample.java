import java.util.regex.Pattern;

public class PatternExample{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("java*programming", "javaaprogramming"));
        System.out.println(Pattern.matches("what * ","are you doing"));
    }
}