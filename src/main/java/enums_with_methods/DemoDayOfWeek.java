package enums_with_methods;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public int isWeekend() {
        return switch (this) {
            case SATURDAY, SUNDAY -> 1;
            default -> 0;
        };
    }

    public String getInfo() {
        return switch (this) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "It`s a work day";
            case SATURDAY, SUNDAY -> "Enjoy the weekend!";
        };
    }
}

public class DemoDayOfWeek {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.TUESDAY;
        System.out.println(day.getInfo());
        System.out.println(day.isWeekend());
    }
}

