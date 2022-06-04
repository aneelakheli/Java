/* 
 * java program using "this" keyword to invoke current class method
 */

package ObjectOrientedConcept.ThisExample;

public class ThisClassMethod {
    void display() {
        this.show();
        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }

    public static void main(String[] args) {
        ThisClassMethod t1 = new ThisClassMethod();
        t1.display();
    }

}
