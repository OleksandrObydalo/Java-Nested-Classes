package enums_with_switch;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Example {


    public static void main(String[] args) {

        for(DayOfWeek dayOfWeek: DayOfWeek.values()){
            System.out.println(DayOfWeektoString(dayOfWeek));
        }

    }

    private static String DayOfWeektoString(DayOfWeek today) {
        return switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                   "Today is " + today + " and it`s  a work day";
            case SATURDAY, SUNDAY ->
                    "Today is " + today + " and it`s a weekend";
            default -> "Invalid day";
        };
    }
}

