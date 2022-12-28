package graph;

public class FindTheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];
        for (int[] t : trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (count[i] == n - 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}};
        System.out.println(findJudge(n, trust));

        int n2 = 3;
        int[][] trust2 = {{1, 3}, {2, 3}};
        System.out.println(findJudge(n2, trust2));
    }
}
