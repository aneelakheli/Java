package src.ObjectOrientedConcept;

public class MountainBike extends Bicycle {
    //
    public int seatHeight;

    public MountainBike(int setHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);
        // TODO Auto-generated constructor stub
        seatHeight = setHeight;
    }

    // the mountainBike subclass has one method.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
