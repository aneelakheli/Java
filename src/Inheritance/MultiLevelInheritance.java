/* 
 * java program to illustrate the concept of 
 * multilevel inheritance
 */

package src.Inheritance;

//Derived class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        three p = new three();
        p.printMulti();
        p.printLevel();
        p.printInheritance();

    }
}

class one {
    public void printMulti() {
        System.out.println("Multi");
    }
}

class two extends one {
    public void printLevel() {
        System.out.println(" Level");
    }
}

class three extends two {
    public void printInheritance() {
        System.out.println(" Inheritance");
    }
}
