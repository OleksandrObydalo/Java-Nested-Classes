package car_example;

public class AnotherClass {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 140, "automatic");
//        System.out.println("Make: " + myCar.make);
//        System.out.println("Model: " + myCar.model);
//        System.out.println("Horsepower: " + myCar.engine.horsepower);
        System.out.println("Transmission type: " + myCar.transmission);
//        myCar.engine.start(); // Causes error as Engine class is private
        myCar.transmission.shift();

        Car.Transmission transmission = myCar.new Transmission("manual");
        System.out.println("transmission = " + transmission);
        System.out.println("myCar.transmission = " + myCar.transmission);
        System.out.println("After calling transmission.ReplaceCurrentTransmission();");
        transmission.ReplaceCurrentTransmission();
        System.out.println("transmission = " + transmission);
        System.out.println("myCar.transmission = " + myCar.transmission);
    }
}
