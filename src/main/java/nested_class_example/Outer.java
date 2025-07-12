package nested_class_example;

public class Outer {
    Nested netsed;
    public Outer() {

        System.out.println("Outer constructor");
        netsed = new Nested();
    }

    class Nested {
        public Nested() {
            System.out.println("Nested constructor");
        }
    }
}
