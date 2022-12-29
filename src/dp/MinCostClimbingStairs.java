package dp;

public class MinCostClimbingStairs {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
    }

    private int minCost(int[] cost, int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return cost[n];
        if (dp[n] != 0)
            return dp[n];
        dp[n] = cost[n] + Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
        return dp[n];
    }

    public static void main(String[] args) {
        MinCostClimbingStairs obj = new MinCostClimbingStairs();
        int[] cost = {10, 15, 20};
        System.out.println(obj.minCostClimbingStairs(cost));

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(obj.minCostClimbingStairs(cost2));
    }
}
