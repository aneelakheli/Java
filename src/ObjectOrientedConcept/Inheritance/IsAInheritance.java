/* 
java program to explain about IS-A inheritance
*/

package ObjectOrientedConcept.Inheritance;

public class IsAInheritance extends ExtendsClass {
    String subName = "sub  class ";

    public static void main(String[] args) {
        IsAInheritance s = new IsAInheritance();
        System.out.println("extendclass has" + s.supName);
        System.out.println("extendclass has" + s.subName);
    }

}

class ExtendsClass {
    String supName = "Super class";
}
