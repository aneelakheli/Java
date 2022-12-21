import java.util.*;

public class LinkedListCollectionImplementation {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<String>();
        System.out.print("List of Fruits..\n");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Pineapple");
        linkedList.add("Jackfruit");

        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
