package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < i + 1 ; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }
            result.add(list);
        }
        return result;
    }
}
