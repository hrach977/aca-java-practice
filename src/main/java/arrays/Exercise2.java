package arrays;

//print the sum of the numbers in array
//output 0 for an empty array
//except the number 13 is very unlucky, so it does not count
//and numbers that come immediately after a 13 also do not count
public class Exercise2 {
    public static void main(String[] args) {
        int[] nums = {5, 13, 2, 11};
        int sum = 0;
        if (nums.length == 0) {
            System.out.println(sum);
        } else {
            if (nums[0]!=13) {
                sum+=nums[0];
            }
            if (nums.length > 1) {
                for (int i=1; i<nums.length; i++) {
                    if (nums[i]!=13 && nums[i-1]!=13) {
                        sum+=nums[i];
                    }
                }
            }
        }
        System.out.println("sum is: " + sum);
    }
}
