package car_example;

public class Car {
    private String make;
    private String model;
    private Engine engine;
    public Transmission transmission;

    public Car(String make, String model, int horsepower, String transmissionType) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsepower);
        this.transmission = new Transmission(transmissionType);
    }

    private class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Starting engine with " + horsepower + " horsepower.");
        }
    }

    public class Transmission {
        private String type;

        public Transmission(String type) {
            this.type = type;
        }

        public void shift() {
            System.out.println("Shifting transmission with " + type + " type.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 140, "automatic");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Horsepower: " + myCar.engine.horsepower);
        System.out.println("Transmission type: " + myCar.transmission.type);
        myCar.engine.start();
        myCar.transmission.shift();
    }
}

