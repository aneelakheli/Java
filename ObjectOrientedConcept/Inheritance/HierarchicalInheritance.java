package ObjectOrientedConcept.Inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B objB = new B();
        objB.printA();
        objB.printB();

        C objC = new C();
        objC.printA();
        objC.printC();

        D objD = new D();
        objD.printA();
        objD.printD();

    }

}

class A {
    void printA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void printB() {
        System.out.println("Class B");
    }
}

class C extends A {
    void printC() {
        System.out.println("Class C");
    }
}

class D extends A {
    void printD() {
        System.out.println("Class D");
    }
}
