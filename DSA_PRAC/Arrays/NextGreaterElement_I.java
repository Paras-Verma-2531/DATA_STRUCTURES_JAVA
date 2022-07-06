package DSA_PRAC.Arrays;

import java.util.Stack;

public class NextGreaterElement_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<nums1.length;i++)
        {
            int j=nums2.length-1;
            while(nums1[i]!=nums2[j])
            {
                stack.push(nums2[j]);
                j--;
            }
            while(!stack.isEmpty()&&stack.peek()<=nums1[i])
                stack.pop();
            nums1[i]=stack.isEmpty()?-1:stack.peek();
            stack.clear();
        }return nums1;
    }
}
