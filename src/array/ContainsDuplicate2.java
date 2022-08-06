package array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,1};
        int k1 = 3;
        int[] nums2 = new int[]{1,2,3,1,2,3};
        int k2 = 2;
        System.out.println(containsNearbyDuplicate(nums1,k1));
        System.out.println(containsNearbyDuplicate(nums2,k2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
