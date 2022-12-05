package stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char lower = Character.toLowerCase(ch);
                if (!stack.isEmpty() && lower == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                char upper = Character.toUpperCase(ch);
                if (!stack.isEmpty() && upper == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
        String s2 = "leEeetcode";
        System.out.println(makeGood(s2));
    }
}
