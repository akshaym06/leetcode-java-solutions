package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,2,2,3,3,4,4,4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int num : nums) {
            if(nums[index] != num) {
                nums[++index] = num;
            }
        }
        return index+1;
    }
}
