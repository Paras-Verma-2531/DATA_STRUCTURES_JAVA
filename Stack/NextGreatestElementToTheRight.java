package Stack;
import java.util.Stack;
public class NextGreatestElementToTheRight {
    public int[] nextGreatestElement(int[]arr)
    {int[] array= new int[arr.length];
        Stack<Integer>stack =new Stack<>();
        stack.push(-1);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(stack.peek()>arr[i])// if the top  element is greater than arr[i]
                array[i]=stack.peek();
            else
            {
                while(!stack.isEmpty()&&stack.peek()<arr[i])// till we do not found element > arr[i]
                    stack.pop();
                array[i]=stack.isEmpty()?-1:stack.peek();
            }stack.push(arr[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr=new NextGreatestElementToTheRight().nextGreatestElement(new int[]{5,4,3,2,1});
        for(int i:arr)
            System.out.println(i);
    }
}
/*
arr=[1,2,1,3,4,5]
ans=[2,3,3,4,5,-1]
 */
