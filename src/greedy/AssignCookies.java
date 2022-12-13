package greedy;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j])
                i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] children = {1, 2, 3}, cookies = {1, 1};
        System.out.println(findContentChildren(children, cookies));

        int[] children2 = {1, 2}, cookies2 = {1, 2, 3};
        System.out.println(findContentChildren(children2, cookies2));
    }
}
