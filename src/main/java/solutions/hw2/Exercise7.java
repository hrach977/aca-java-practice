package solutions.hw2;

public class Exercise7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new int[nums.length];
        if (nums.length!=0) {
            for (int i = 1; i < nums.length; i++) {
                res[i - 1] = nums[i];
            }
            res[res.length - 1] = nums[0];
        }
        for (int a: res) {
            System.out.println(a);
        }
    }
}
