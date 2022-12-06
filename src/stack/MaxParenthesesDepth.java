package stack;

import java.util.Stack;

public class MaxParenthesesDepth {
    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for(char ch : s.toCharArray()){
            if (ch == '('){
                stack.push('(');
                res = Math.max(res, stack.size());
            }
            else if (ch == ')'){
                stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s1));

        String s2 = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s2));
    }
}
