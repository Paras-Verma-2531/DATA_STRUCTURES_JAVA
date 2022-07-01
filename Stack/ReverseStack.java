package Stack;
import java.util.Stack;
public class ReverseStack {
    public static Stack reverse(Stack stack)
    {
        Stack<Integer>st=new Stack<>();
        while(!stack.isEmpty())
        {
            st.push((Integer) stack.pop());
        }return st;
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("the stack is :"+stack);
        System.out.println("the reverse stack is"+ReverseStack.reverse(stack));
    }
}
