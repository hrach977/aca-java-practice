package solutions.hw3;

public class Exercise5 {
    public static String theEnd(String word, boolean front) {
//        if (front) {
//            return word.charAt(0) + "";
//        }
//        return word.charAt(word.length()-1) + "";
        return front ? word.charAt(0) + "" : word.charAt(word.length()-1) + "";
    }
}
