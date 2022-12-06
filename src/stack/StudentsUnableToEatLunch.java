package stack;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class StudentsUnableToEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.add(sandwiches[i]);
        }
        for (int student : students) {
            queue.add(student);
        }
        int count = 0;
        while (stack.size() != 0) {
            if (Objects.equals(stack.peek(), queue.peek())) {
                count = 0;
                stack.pop();
                queue.poll();
            } else {
                int top = queue.poll();
                queue.add(top);
                count++;
            }

            if (count == queue.size()) {
                return count;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0}, sandwiches = {0, 1, 0, 1};
        System.out.println(countStudents(students, sandwiches));

        int[] students2 = {1, 1, 1, 0, 0, 1}, sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students2, sandwiches2));
    }
}
