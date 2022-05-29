package ObjectOrientedConcept.objectReferenceExample;

import java.lang.String;

class Students {
    int rollId;
    String name;

    void insertRecord(int id, String n) {
        rollId = id;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollId + " " + name);
    }
}

public class ObjectUsingMethod {
    public static void main(String args[]) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
