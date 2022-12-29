package dp;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i % 2);
        }
        return dp;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] res = countBits(n);
        for (int i : res)
            System.out.print(i + " ");

        System.out.println();

        n = 5;
        res = countBits(n);
        for (int i : res)
            System.out.print(i + " ");
    }
}
