package DSA_PRAC.Stacks;
import java.util.Stack;
public class MinStack {
    int[] arr;
    Stack<int[]> stack;

    public MinStack() {
        arr = new int[2];
        stack = new Stack<>();
    }

    public void push(int num) {
        if (stack.isEmpty()) {
            stack.push(new int[]{num, num});
        } else {
            int min = stack.peek()[1];
            min = Math.min(min, num);
            stack.push(new int[]{num, min});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek()[0];
    }

    public int getMin() {
        return stack.isEmpty() ? -1 : stack.peek()[1];
    }
}


