package src.ObjectOrientedConcept.Polymorphism;

class Role {
    boolean iSPermission = false;

    void permission() {
        System.out.println("Permision of base class");
    }
}

class Admin extends Role {
    void permission() {
        System.out.println("Admin Permission of derived class");
        if (iSPermission) {
            System.out.println("Admin function running");
        } else {
            System.out.println("Running admin function");
        }
    }
}

public class MethodOveridding {
    public static void main(String[] args) {
        Role r = new Role();
        Role rAdmin = new Admin();
        r.permission();
        rAdmin.permission();

    }
}