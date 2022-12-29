package dp;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row, prev_row = null;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev_row.get(j - 1) + prev_row.get(j));
                }
            }
            prev_row = row;
            res = row;
        }
        return res;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}
