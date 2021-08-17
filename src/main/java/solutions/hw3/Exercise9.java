package solutions.hw3;

public class Exercise9 {
    public static String seeColor(String word) {
        if (word.startsWith("red")) {
            return "red";
        }
        if (word.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
