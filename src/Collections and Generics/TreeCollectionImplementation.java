import java.util.*;

public class TreeCollectionImplementation {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        System.out.print("Collection Framwork List:\n");
        ts.add("Array");
        ts.add("ArrayList");
        ts.add("LinkedList");
        ts.add("Vector");
        ts.add("Set");
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
