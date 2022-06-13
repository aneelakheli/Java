/* 
 * a program for using "this" keyword
 * as method parameters
 */

package src.ObjectOrientedConcept.ThisExample;

public class ThisMethodExe {
    int a;
    int b;

    ThisMethodExe() {
        a = 80;
        b = 90;
    }

    // method that receives "this " keyword as parameters
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
