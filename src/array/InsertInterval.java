package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int[] toAdd = newInterval;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > toAdd[1]) {
                ans.add(toAdd);
                toAdd = intervals[i];
            }
            else if (intervals[i][1] >= toAdd[0])
                toAdd = new int[]{Math.min(intervals[i][0], toAdd[0]),
                        Math.max(intervals[i][1], toAdd[1])};
            else ans.add(intervals[i]);
        }
        ans.add(toAdd);
        return ans.toArray(new int[ans.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{6,9}};
        int[] newInterval = new int[]{2,5};

        int[][] res = insert(intervals,newInterval);
        System.out.println(Arrays.deepToString(res));
    }
}
