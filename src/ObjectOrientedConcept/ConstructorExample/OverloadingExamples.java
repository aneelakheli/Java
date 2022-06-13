package src.ObjectOrientedConcept.ConstructorExample;

public class OverloadingExamples {
    final double PI = 3.14;

    public static void main(String[] args) {
        OverloadingExamples ol = new OverloadingExamples();
        ol.area();
        ol.area(3);
        ol.area(6, 3);

    }

    public void area() {
        System.out.println("Find the Area");
    }

    public void area(int r) {
        System.out.println("Area of circle " + PI * r * r);
    }

    public void area(int l, int b) {
        System.out.println("Area of rectangle is " + l * b);
    }

}
