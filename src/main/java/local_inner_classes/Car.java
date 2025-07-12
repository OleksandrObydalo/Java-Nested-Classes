package local_inner_classes;

public class Car {
    private int year;
    private String make;
    private String model;

    public void start(int horsepower, Compressor compressor) {
        System.out.println("Starting the car");

        class Engine {
            private int horsepower;
            private Compressor compressor;

            public Engine(int horsepower, Compressor compressor) {
                this.horsepower = horsepower;
                this.compressor = compressor;
            }

            public void rev() {
                System.out.println("The engine is revving at " + horsepower + " horsepower.");
                System.out.println("Compressor has diameter " + compressor.diameter);
            }
        }

        Engine engine = new Engine(horsepower, compressor);
        compressor.diameter = 200;
        engine.rev();
    }

    class Compressor{
        public int diameter;

        public Compressor(int diameter) {
            this.diameter = diameter;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start(1000, car.new Compressor(100));
    }
}



