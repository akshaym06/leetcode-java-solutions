package stack;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch == stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        for(Character ch:stack){
            res.append(ch);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s1 = "abbaca";
        System.out.println(removeDuplicates(s1));

        String s2 = "azxxzy";
        System.out.println(removeDuplicates(s2));
    }
}
