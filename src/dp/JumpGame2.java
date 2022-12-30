package dp;

public class JumpGame2 {
    public static int jump(int[] nums) {
        return jumpRec(nums, 0, new int[nums.length]);
    }

    private static int jumpRec(int[] nums, int start, int[] output) {
        if (start >= nums.length - 1) {
            return 0;
        }
        if (output[start] != 0) {
            return output[start];
        }
        int min = 10001;
        for (int i = start + 1; i <= nums[start] + start; i++) {
            min = Math.min(min, 1 + jumpRec(nums, i, output));
        }
        output[start] = min;
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
