package testSK;

public class Sedan extends Car {

    private double carSpeed; // км/ч

    public Sedan(double engineCapacity, double fuelQuantity, double carSpeed) {
        super(engineCapacity, fuelQuantity);
        // л/100км, объем бака в л
        this.carSpeed = carSpeed;
    }

    @Override
    public void printMessage(String city) {
        System.out.println("Еду в " + city + " co скоростью " + carSpeed + " км/ч");

    }
}

