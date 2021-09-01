package nested;

import java.util.Scanner;

public enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7);

    int index;

    Day(int i) {
        index = i;
    }
}
