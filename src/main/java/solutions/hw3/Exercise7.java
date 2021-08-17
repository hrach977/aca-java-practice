package solutions.hw3;

public class Exercise7 {
    public static String middleThree(String word) {
        int middle = word.length()/2;
        return word.substring(middle-1, middle+2);
    }
}
