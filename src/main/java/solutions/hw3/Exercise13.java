package solutions.hw3;

public class Exercise13 {
    public static String extraEnd(String str) {
        String last = str.substring(str.length()-2);
        return last + last + last;
    }
}
