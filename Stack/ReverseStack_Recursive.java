package Stack;
import java.util.Stack;
public class ReverseStack_Recursive {
    public static void insertAtBottom(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty()) {
            stack.push(x);return;
        }
        int num= stack.pop();
        insertAtBottom(stack,x);
        stack.push(num);
    }
    public static void reverse(Stack<Integer>stack)
    {
        if(stack.isEmpty())
            return;
        int x=stack.pop();
        reverse(stack);
        insertAtBottom(stack,x);
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        int i=1;
        while(i<=5)
            stack.push(i++);
        System.out.println(stack);//Normal stack
        //insertAtBottom(stack,6);
        reverse(stack);
        for(int num:stack)
            System.out.print(num+" ");// Reverse Stack
    }
}
