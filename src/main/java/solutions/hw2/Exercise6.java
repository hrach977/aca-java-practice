package solutions.hw2;

public class Exercise6 {
    public static void main(String[] args) {
        int[] nums = {34, 2, 12, 4, 3};
        boolean doesNotContain = true;
        for (int element : nums) {
            if (element == 1 || element == 3) {
                doesNotContain = false;
                break;
            }
        }
        System.out.println(doesNotContain);
    }
}
