package anonymous_class;

public class Car {
    private String model;
    private int year;
    private Engine engine;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        // Anonymous inner class for setting up the engine
        this.engine = new Engine() {
            public Engine engine;
            @Override
            public void start() {
                // Anonymous inner class inside of anonymous class
                this.engine = new Engine() {
                    @Override
                    public void start() {
                        System.out.println("The engine of the car " + model + " has started.");
                    }

                    @Override
                    public void stop() {
                        System.out.println("The engine of the car " + model + " has stopped.");
                    }

                };

                System.out.println("The engine of the car " + model + " has started.");
                System.out.println("Result of this.engine.start();");
                this.engine.start();
            }

            @Override
            public void stop() {
                System.out.println("The engine of the car " + model + " has stopped.");
            }

        };
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }

    private abstract class Engine {
        public abstract void start();
        public abstract void stop();
    }

    public static void main(String[] args) {
        Car car = new Car("ToyotaCamry", 2022);
        car.startCar();
        car.stopCar();
    }
}

