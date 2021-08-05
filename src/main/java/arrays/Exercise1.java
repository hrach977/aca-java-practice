package arrays;

//Write the number of even ints in the given array
public class Exercise1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int evenCount=0;
//        for (int i=0; i<nums.length; i++) {
//            if (nums[i]%2==0) {
//                evenCount++;
//            }
//        }
        for (int number : nums) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("number of even integers: " + evenCount);
    }
}
