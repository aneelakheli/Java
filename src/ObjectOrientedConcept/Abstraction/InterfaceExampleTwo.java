package src.ObjectOrientedConcept.Abstraction;

public class InterfaceExampleTwo {
    public static void main(String[] args) {
        Bank n = new Nabil();
        Bank m = new NMB();
        System.out.println("ROI: " + n.rateOfInterest());
        System.out.println("ROI: " + n.calculateInterest());
        System.out.println("ROI: " + m.rateOfInterest());
        System.out.println("ROI: " + m.calculateInterest());
    }

}

interface Bank {
    float year = 7;

    float rateOfInterest();

    float calculateInterest();

}

class Nabil implements Bank {

    public float rateOfInterest() {
        return 9.15f;
    }

    public float calculateInterest() {
        return rateOfInterest() * year;
    }

}

class NMB implements Bank {

    public float rateOfInterest() {
        return 9.7f;
    }

    public float calculateInterest() {
        return rateOfInterest() * year;
    }

}
