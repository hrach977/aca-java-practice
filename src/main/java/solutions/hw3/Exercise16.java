package solutions.hw3;

public class Exercise16 {
    public static String withoutEnd(String str) {
        if (str.length()<=2) {
            return "";
        }
        return str.substring(1, str.length()-1);
    }
}
