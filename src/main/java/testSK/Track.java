package testSK;

public class Track extends Car {

    private double trackWeight; //тонн

    public Track(double engineCapacity, double fuelQuantity, double trackWeight) {
        super(engineCapacity, fuelQuantity);
        // л/100км
        // объем бака в л
        this.trackWeight = trackWeight;
    }

    @Override
    public void printMessage(String city) {
        System.out.println("Еду в " + city + " c весом " + trackWeight + " тонн");
    }
}