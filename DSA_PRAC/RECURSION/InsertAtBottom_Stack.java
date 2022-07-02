package DSA_PRAC.RECURSION;
import java.util.Stack;
public class InsertAtBottom_Stack {
    public void insertAtBottom(Stack<Integer>stack,int x)
    {
        if(stack.isEmpty()){stack.push(x);return;}
        int n=stack.pop();
        insertAtBottom(stack,x);// recursive call
        stack.push(n);
    }
    public static void main(String[] args) {
        Stack<Integer>stack= new Stack<>();
        int i=1;
        while(i<=5)
        {
            stack.push(i++);
        }
        System.out.println(stack);
        new InsertAtBottom_Stack().insertAtBottom(stack,6);
        System.out.println(stack);
    }
}
