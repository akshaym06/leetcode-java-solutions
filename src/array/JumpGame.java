package array;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int last = n - 1, i, j;
        for (i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= last)
                last = i;
        }
        return last <= 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 4};
        System.out.println(canJump(arr));
    }
}
