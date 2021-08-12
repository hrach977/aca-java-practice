package solutions.hw2;

public class Exercise9 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] nums = {1, 4, 1, 4, 3};
        for (int a: nums) {
            if (a!=1 && a!=4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
