package stack;

import java.util.Stack;

public class SpecialDiscountInShop {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                prices[stack.pop()] -= prices[i];
            stack.push(i);
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] ans = finalPrices(prices);
        for (int i : ans)
            System.out.print(i + " ");

        System.out.println();

        int[] prices2 = {1, 2, 3, 4, 5};
        int[] ans2 = finalPrices(prices2);
        for (int i : ans2)
            System.out.print(i + " ");
    }
}
