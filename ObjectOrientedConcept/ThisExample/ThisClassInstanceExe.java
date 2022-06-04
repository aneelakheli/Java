package ObjectOrientedConcept.ThisExample;

public class ThisClassInstanceExe {
    int a;
    int b;

    ThisClassInstanceExe() {
        a = 80;
        b = 50;
    }

    ThisClassInstanceExe get() {
        return this;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        ThisClassInstanceExe obj = new ThisClassInstanceExe();
        obj.get().display();
    }

}
