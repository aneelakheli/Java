/*  Java code for using this as an argument in constructor call Class with object of Class B as its data member
 * 
 */

package ObjectOrientedConcept.ThisExample;

class ClassSecond {
    ThisConstructorCall obj;

    ClassSecond(ThisConstructorCall obj) {
        this.obj = obj;
        obj.display();
    }

}

public class ThisConstructorCall {
    int num1 = 25;

    ThisConstructorCall() {
        ClassSecond obj = new ClassSecond(this);

    }

    void display() {
        System.out.println("The value of second class :" + num1);
    }

    public static void main(String[] args) {
        ThisConstructorCall obj = new ThisConstructorCall();
    }
}
