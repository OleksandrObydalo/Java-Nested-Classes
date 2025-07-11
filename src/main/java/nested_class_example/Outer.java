package nested_class_example;

public class Outer {
    public Outer() {
        System.out.println("Outer constructor");
    }

    static class Nested {
        public Nested() {
            System.out.println("Nested constructor");
        }
    }
}
