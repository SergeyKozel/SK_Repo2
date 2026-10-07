package testSK;

public abstract class Car {

    protected double engineCapacity;
    protected double fuelQuantity;

    public Car(double engineCapacity, double fuelQuantity) {
        this.engineCapacity = engineCapacity;
        this.fuelQuantity = fuelQuantity;
    }

    public abstract void printMessage(String city);

    int distance1 = 360; //расстояние в км до Minsk
    int distance2 = 750; //...Vitebsk
    int distance3 = 580; //...Gomel

    public void driveTo(String city) throws IllegalAccessException {

        switch (city) {
            case "Minsk":
                fuelQuantity = fuelQuantity - (engineCapacity * distance1 / 100);
                break;
            case "Vitebsk":
                fuelQuantity = fuelQuantity - (engineCapacity * distance2 / 100);
                break;
            case "Gomel":
                fuelQuantity = fuelQuantity - (engineCapacity * distance3 / 100);
                break;
            default:
                throw new IllegalAccessException("Введите правильное значение " + city);
        }
        System.out.println(this.getClass().getSimpleName());
        printMessage(city);
        System.out.println("Остаток топлива поcле поездки: " + fuelQuantity + " л." );
        System.out.println("*******************");

    }


}
