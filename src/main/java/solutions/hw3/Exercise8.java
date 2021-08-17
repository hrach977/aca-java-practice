package solutions.hw3;

public class Exercise8 {
    public static String lastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char second = b.length() > 0 ? b.charAt(b.length()-1) : '@';
        return first + "" + second;
    }
}
