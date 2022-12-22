import java.util.*;

public class VectorImplementation {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String> ();
        System.out.print("Name according to alphabetic order:\n");
        v.add("Aabiskar");
        v.add("Aaditya");
        v.add("Aarjan");
        v.add("Ashmina");
        Iterator<String> itr =  v.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next()); 
        }
    }
    
}
