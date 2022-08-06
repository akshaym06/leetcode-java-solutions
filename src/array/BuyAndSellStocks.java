package array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0 ;
        }
        int max = 0 ;
        int minPrice = prices[0] ;
        for (int i = 0 ; i < prices.length ; ++i) {
            if (prices[i] > minPrice) {
                max = Math.max(max, prices[i] - minPrice) ;
            } else{
                minPrice = prices[i];
            }
        }
        return  max ;
    }
}
