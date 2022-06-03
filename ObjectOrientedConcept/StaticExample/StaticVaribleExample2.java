package ObjectOrientedConcept.StaticExample;

public class StaticVaribleExample2 {
    String details;
    int rollNo = 90;
    String name = " arya";
    static String college = "birendra aadarsha";

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
        sv1.getInformation(10, "Aneel");
        String info = sv1.setInformation();
        System.out.println(info);
    }
}
