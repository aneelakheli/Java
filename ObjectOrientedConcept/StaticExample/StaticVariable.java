package ObjectOrientedConcept.StaticExample;

class StaticVariable {
    static int a = m1();
    static {
        System.out.println("Static method");
    }

    static int m1() {
        System.out.println("inside static block");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("value if a " + a + " from a main");
    }
}