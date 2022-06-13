// use of super with variables
package src.ObjectOrientedConcept.Polymorphism;

class Bike {
    String color = "white";
}

class RoyalEnfields extends Bike {
    String color = "Black";

    void getColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperClassExample {
    public static void main(String[] args) {
        RoyalEnfields d = new RoyalEnfields();
        d.getColor();
    }

}
