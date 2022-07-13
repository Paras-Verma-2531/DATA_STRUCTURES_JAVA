package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    // implement queue using two stack
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();
    public void push(int data)
    {
        stack1.push(data);// add the data in one of the stack
    }
    public int pop()
    { int ans=-1;
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());// push in into other stack[this will be pushed in FIFO]
        stack2.pop();//result
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());// again push the element into empty stack
        return ans;
    }
}
