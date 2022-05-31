package ObjectOrientedConcept.ConstructorExample;

public class ParameterizedExample {
    int rollId;
    String name;

    ParameterizedExample(int r, String n) {
        rollId = r;
        name = n;
    }

    void displayParameterizedExe() {
        System.out.println(rollId + " " + name);
    }

    public static void main(String[] args) {
        ParameterizedExample pe = new ParameterizedExample(12, "rameshwor");
        pe.displayParameterizedExe();
    }
}
