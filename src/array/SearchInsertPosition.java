package array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums =new int[]{1,3,5,6};
        System.out.println("target is 5 : " + searchInsert(nums, 5));
        System.out.println("target is 2 : " + searchInsert(nums, 2));
        System.out.println("target is 7 : " + searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while(low <= high){
            mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high= mid -1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}
