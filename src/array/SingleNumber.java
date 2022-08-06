package array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans =0;
        int len = nums.length;

        for(int i=0;i!=len;i++)
            ans ^= nums[i];

        return ans;
    }
}
