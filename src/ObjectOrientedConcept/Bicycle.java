package src.ObjectOrientedConcept;

public class Bicycle {
    // a class has three instance variable
    public int cadence;
    public int gear;
    public int speed;

    // A bicycle has one constructor
    public Bicycle(int startCadence, int startGear, int startSpeed) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // A Bicycle has four method
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}
