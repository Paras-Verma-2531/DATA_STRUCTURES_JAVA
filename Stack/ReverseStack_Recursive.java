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
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        int i=1;
        while(i<=5)
            stack.push(i++);
        System.out.println(stack);// before insertAtBottom method
        insertAtBottom(stack,6);
        for(int num:stack)
            System.out.print(num+" ");// after insertAtBottom
    }
}
