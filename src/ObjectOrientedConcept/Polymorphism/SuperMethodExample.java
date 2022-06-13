package src.ObjectOrientedConcept.Polymorphism;

class Person {
    void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    void display() {
        // will invoke or call current class message() method
        message();
        // will invoke or call parent class message() method
        super.message();

    }

}

public class SuperMethodExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }

}
