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
    }
}
