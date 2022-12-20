import java.util.*;

public class ArrayListCollectionImplementation{
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Kathmandu");
    list.add("Pokhara");
    list.add("Ilam");
    list.add("Baglung");

    Iterator itr = list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}