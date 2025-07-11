package enums;

public enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private final String hexCode;

    private Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void printColor() {
        System.out.println("This color is " + this.name());
    }

    public static void main(String[] args) {
        Color myColor = Color.RED;
        System.out.println(myColor.getHexCode());
        for (Color color : Color.values()) {
            System.out.println(color + " has a hex code of " + color.getHexCode());
        }
    }
}

