package ObjectOrientedConcept.objectReferenceExample;

import java.lang.String;

class Student {
    int rollId;
    String name;

    void insertRecord(int r, String n) {
        rollId = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollId + " " + name);
    }
}

public class ObjectUsingMethod {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
