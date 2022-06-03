package ObjectOrientedConcept.StaticExample;

public class StaticVaribleExample2 {
    String details;
    int rollNo;
    String name;
    static String college = "College ";

    public void getInformation(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String setInformation() {
        return rollNo + " " + name + " " + college;
    }

    public static void main(String[] args) {
        StaticVaribleExample2 sv1 = new StaticVaribleExample2();
        StaticVaribleExample2 sv2 = new StaticVaribleExample2();
        sv1.getInformation(10, "ABC");
        sv2.getInformation(11, "DEF");
        System.out.println(sv1.setInformation());
        System.out.println(sv2.setInformation());
    }
}
