package solutions.hw3;

public class Exercise11 {
    public static String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
