package nested;

import static nested.Day.*;

public class Demo5 {
    public static void main(String[] args) {
        tellItLikeItIs(MONDAY);
        tellItLikeItIs(FRIDAY);
        tellItLikeItIs(SUNDAY);
        tellItLikeItIs(WEDNESDAY);
        tellItLikeItIs(TUESDAY);
        tellItLikeItIs(THURSDAY);
        System.out.println("**********");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

    }

    public static void tellItLikeItIs(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("mondays are bad");
                break;
            case FRIDAY:
                System.out.println("fridays are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("weekends are the best");
                break;
            default:
                System.out.println("midweek days are so so");
                break;
        }
    }
}
