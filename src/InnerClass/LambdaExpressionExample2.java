import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        numbers.forEach(method);

    }
    
}
