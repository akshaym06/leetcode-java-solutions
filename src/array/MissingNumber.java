package array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len * (len + 1)) / 2;

        for (int i : nums) {
            sum -= i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));

        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums2));
    }
}
