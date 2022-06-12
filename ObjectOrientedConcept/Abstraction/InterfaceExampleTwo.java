package ObjectOrientedConcept.Abstraction;

import java.util.Scanner;

public class InterfaceExampleTwo {
    public static void main(String[] args) {
        Bank n = new Nabil();
        System.out.println("ROI: " + n.rateOfInterest());
    }

}

interface Bank {

    float rateOfInterest();

}

class Nabil implements Bank {

    public float rateOfInterest() {
        return 9.15f;
    }

}

class NMB implements Bank {

    public float rateOfInterest() {
        return 9.7f;
    }

}
