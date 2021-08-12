package solutions.hw2;

public class Exercise11 {
    public static void main(String[] args) {
        int[] nums = {};
        int max = nums[0];
        int min = nums[0];
        for (int a : nums) {
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println((max - min));
    }
}
