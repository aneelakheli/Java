package ObjectOrientedConcept.StaticExample;

public class StaticClassEx {
    private static String str = "Javapratice by Aneel";

    // static class
    static class MYNestedClass {
        // non-static method
        public void disp() {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StaticClassEx.MYNestedClass obj = new StaticClassEx.MYNestedClass();
        obj.disp();
    }

}
