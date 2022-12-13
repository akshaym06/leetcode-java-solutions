package greedy;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int ele : count) {
            ans += ele / 2 * 2;
            if (ans % 2 == 0 && ele % 2 != 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }
}
