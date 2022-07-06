package Stack;

import java.util.Stack;

public class PreviousSmallerElement {
    public int[] previousSmallerElement(int[] arr)
    {
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        int[] array= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(stack.peek()<arr[i])
                array[i]=stack.peek();
            else
            {
                while(!stack.isEmpty()&&stack.peek()>=arr[i])
                    stack.pop();
                array[i]=stack.isEmpty()?-1:stack.peek();
            }stack.push(arr[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int [] arr= new PreviousSmallerElement().previousSmallerElement(new int[]{1,2,5,1,5});
        for(int i: arr)
            System.out.println(i);
    }
}
