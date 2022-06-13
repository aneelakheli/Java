package src.ObjectOrientedConcept;

import java.util.Scanner;

class Box {

    double width;
    double height;
    double depth;
}

public class ClassExample {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.depth = 15;
        myBox.height = 20;
        myBox.width = 10;

        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("volume is " + vol);
    }

}
