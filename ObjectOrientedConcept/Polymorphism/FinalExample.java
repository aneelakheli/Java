
package ObjectOrientedConcept.Polymorphism;

public class FinalExample {
    int id;
    String name;
    final String PAN_CARD_NUMBER;

    FinalExample(int id, String name, String PAN_CARD_NUMBER) {
        this.id = id;
        this.name = name;
        this.PAN_CARD_NUMBER = PAN_CARD_NUMBER;
    }

    void display() {
        System.out.println(id + " " + name + " " + PAN_CARD_NUMBER);
    }

    public static void main(String[] args) {
        FinalExample fe = new FinalExample(101, "Arjan", "somethingintheway");
        fe.display();
    }

}
