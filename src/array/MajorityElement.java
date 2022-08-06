package array;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer result = null;

        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (num == result) ? 1 : -1;
        }

        return result;
    }
}
