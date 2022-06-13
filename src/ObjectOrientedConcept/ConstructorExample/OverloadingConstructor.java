package src.ObjectOrientedConcept.ConstructorExample;

class OverloadingConstructor {
    float interest;
    float rate;
    float principle;
    float years;

    public OverloadingConstructor() {
        float r = 3, p = 2000, y = 9;
        rate = r;
        principle = p;
        years = y;
    }

    public OverloadingConstructor(float r, float p, float y) {
        rate = r;
        principle = p;
        years = y;
    }

    public float calculatingInterest() {
        return interest = (principle * years * rate) / 100;

    }

    public void displayInterest() {
        System.out.println("The interest is " + interest);
    }

    public static void main(String[] args) {
        OverloadingConstructor oc1 = new OverloadingConstructor();
        OverloadingConstructor oc2 = new OverloadingConstructor(10, 1000, 3);
        oc1.calculatingInterest();
        oc1.displayInterest();
        oc2.calculatingInterest();
        oc2.displayInterest();
    }
}