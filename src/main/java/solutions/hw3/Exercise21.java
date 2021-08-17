package solutions.hw3;

public class Exercise21 {
    public static boolean endOther(String a, String b) {
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        return first.endsWith(second) || second.endsWith(first);
    }
}
