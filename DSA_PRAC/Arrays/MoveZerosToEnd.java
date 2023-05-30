package DSA_PRAC.Arrays;
import java.util.Arrays;

import static DSA_PRAC.Arrays.LeftRotateAnArray.swap;
public class MoveZerosToEnd {
    //brute force Approach : O(n) O(n)
    public int[] moveZerosToEnd(int[]arr,int size)
    {
         int []temp=new int[size];
         int j=0;
         for(int i:arr)
         {
             if(i!=0)temp[j++]=i;
         }return temp;
    }
    //optimal Approach : O(n) O(1)
    public void moveZerosToEnd(int []arr)
    {
        int j=-1;//stores first zero index
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;break;
            }
        }
        if(j!=-1) {
            for (int i = j + 1; i < arr.length; i++)
            //start from right most ele. to first zero index
                {
                if (arr[i] != 0) {
                    swap(arr, i, j);// if i is at non zero index swap it with j
                    j++;//j will always be at zero
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,0,0,0,6,7,8};
        new MoveZerosToEnd().moveZerosToEnd(arr);
        for (int i:arr)
            System.out.print(i+" ");
        System.out.println(Arrays.toString(new MoveZerosToEnd().moveZerosToEnd(arr,11)));
    }
}
