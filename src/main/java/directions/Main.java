package directions;

enum Directions{
    NORTH(1), SOUTH(2), WEST(3), EAST(4);
    public int value;
    /*public*/ Directions(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        for(Directions direction: Directions.values()){
            System.out.print(direction.value + " ");
        }
    }
}
