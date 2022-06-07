/* 
 * java program to illustrate method overloading
 */
package ObjectOrientedConcept.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        OverloadingExample o2 = new OverloadingExample();
        System.out.println(o2.add(20, 30));
        System.out.println(o2.add(40, 20, 60));

    }

}

class OverloadingExample {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
