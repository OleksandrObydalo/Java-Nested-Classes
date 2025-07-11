package static_nested_class;

public class OuterClass {
    private static int x = 10;

    public static class InnerClass {
        public void printX() {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.printX();
    }
}

