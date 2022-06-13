package src.ObjectOrientedConcept.StaticExample;

class StaticDemo {
    String name;
    int rollNo;
    // static variable
    static String cllgName;
    static int counter = 0;

    public StaticDemo(String name) {
        this.name = name;
        this.rollNo = SetRollNo();
    }

    // getting unique rollno through static variable(counter)
    static int SetRollNo() {
        counter++;
        return counter;
    }

    // static method
    static void setCllg(String name) {
        cllgName = name;
    }

    void getStaticInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("rollNo: " + this.rollNo);
        // accessing static variable
        System.out.println("Cllg Name: " + cllgName);

    }

}

public class StaticMethodEx {
    public static void main(String[] args) {
        StaticDemo.setCllg("HariRam");
        StaticDemo sd1 = new StaticDemo("Ram");
        StaticDemo sd2 = new StaticDemo("Bob");

        sd1.getStaticInfo();
        sd2.getStaticInfo();

    }
}
