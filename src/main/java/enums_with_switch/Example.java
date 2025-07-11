package enums_with_switch;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Example {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;

        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.println("Today is a work day");
            case SATURDAY, SUNDAY ->
                    System.out.println("Today is a weekend day");
            default ->
                    System.out.println("Invalid day");
        }
    }
}

