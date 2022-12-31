package dp;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int[] storage = new int[nums.length];
        int max = nums[0];
        storage[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            storage[i] = Math.max(storage[i - 1] + nums[i], nums[i]);
            if (storage[i] > max) {
                max = storage[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
