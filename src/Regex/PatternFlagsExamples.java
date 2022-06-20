// Java program to demonstrate
// Pattern.flags() method

import java.util.regex.*;

public class PatternFlagsExamples {
    public static void main(String[] args) {
        //create a REGEX string
        String REGEX = "(.*)(for)(.*)?";
        //create string in which you want to search
        String actual = "code of machineto"; 
        //compile the regex to create pattern using compile() method
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile(REGEX, Pattern.MULTILINE);
        Pattern pattern2 = Pattern.compile(REGEX, Pattern.UNICODE_CASE);
        Pattern pattern3 = Pattern.compile(REGEX, Pattern.COMMENTS);
        int flag = pattern.flags();
        int flag1 = pattern1.flags();
        int flag2 = pattern2.flags();
        int flag3 = pattern3.flags();
        System.out.println("Patterns match flags = "+flag);
        System.out.println("Patterns match flags = "+flag1);
        System.out.println("Patterns match flags = "+flag2);
        System.out.println("Patterns match flags = "+flag3);
    }
}
