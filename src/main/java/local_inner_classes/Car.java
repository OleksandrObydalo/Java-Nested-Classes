package local_inner_classes;

public class Car {
    private int year;
    private String make;
    private String model;

    public void start() {
        System.out.println("Starting the car");

        class Engine {
            private int horsepower;

            public Engine(int horsepower) {
                this.horsepower = horsepower;
            }

            public void rev() {
                System.out.println("The engine is revving at " + horsepower + " horsepower.");
            }
        }

        Engine engine = new Engine(200);
        engine.rev();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

