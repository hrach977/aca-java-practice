package solutions.hw3;

public class Exercise10 {
    public static String extraFront(String word) {
        if (word.length() >= 2) {
            String front = word.substring(0, 2);
            return front + front + front;
        }
        return word + word + word;
    }
}
