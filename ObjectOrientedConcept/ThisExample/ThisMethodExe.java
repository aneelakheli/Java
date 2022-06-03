package ObjectOrientedConcept.ThisExample;

public class ThisMethodExe {
    int a;
    int b;

    ThisMethodExe() {
        a = 80;
        b = 90;
    }

    int display(ThisMethodExe obj) {
        int sum = a + b;
        return sum;

    }

    void get() {
        System.out.println(display(this));
    }

    public static void main(String[] args) {
        ThisMethodExe object = new ThisMethodExe();
        object.get();
    }
}