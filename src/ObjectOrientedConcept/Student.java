// In this example, we have created a Student class which has two data members 
// id and name. We are creating the object of the Student class by new keyword and printing the object's value.
// Here, we are creating a main() method inside the class.

package src.ObjectOrientedConcept;

public class Student {
    String name = "ABC XYZ";
    int rollNO = 12;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.rollNO);

    }
}
