package ObjectOrientedConcept.Polymorphism;

public class OverloadingExample {

    public void area() {
        System.out.println("Find the area");
    }

    public void area(int radius) {
        System.out.println("Circle area= " + 3.14 * radius * radius);
    }

    public void area(int length, int breadth) {
        System.out.println("Rectangle area = " + length * breadth);
    }

    public void area(Double l, Double b) {
        System.out.println("Rectangle area = " + 0.5 * l * b);
    }

    public static void main(String[] args) {

        OverloadingExample myShapes = new OverloadingExample();
        myShapes.area();
        myShapes.area(90);
        myShapes.area(40, 30);
        myShapes.area(5.6, 4.5);
    }
}
