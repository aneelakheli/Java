package ObjectOrientedConcept.Polymorphism;

class Bank {
    Bank() {
        System.out.println("Parent class returning");
    }
}

class Nabil extends Bank {
    Nabil() {
        super();
        System.out.println("Nabil branch is printing");

    }

}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Nabil n = new Nabil();

    }

}
