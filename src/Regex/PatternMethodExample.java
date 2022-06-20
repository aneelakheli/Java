import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMethodExample {
    public static void main(String[] args) {
        String eg ="is";
        String actualString = "alliswell";
        Pattern pattern = Pattern.compile(eg);
        String[] strArray = pattern.split(actualString);
        for(int i =0; i<strArray.length; i++){
            System.out.println("array[" + i +"]" + strArray[i]);
        }
        //create the string
        String input ="helloworldareyouheredayremoda";
        //create a regex string
        String value = "da";
        //create equivalent string for regex
        String inValue = Pattern.quote(value);
        //create a pattern using invalue
        Pattern pattern1 = Pattern.compile(inValue);
        //get a matcher object
        Matcher matcher = pattern1.matcher(input);
        // print values if match found
        boolean matchFound = false;
        while(matcher.find()){
            System.out.println("Found the Regex in text: " +  matcher.group() + "Starting index " + matcher.start() + " and ending index: " + matcher.end());
            matchFound = true;
        }
        if(!matchFound){
            System.out.println("No match found");
        }



    }
    
}
