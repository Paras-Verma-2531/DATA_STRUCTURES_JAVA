package DSA_PRAC.Arrays;
public class MaximumConsecutiveOnes {
    public int maximumConsecutiveOnes(int[]arr,int size)
    {int max=0,count=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]!=1)count=0;//else make count as 0;
            else count+=1;// for every consecutive one make count ++;
            max=Math.max(count,max);// store the max in max
        }return max;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumConsecutiveOnes().maximumConsecutiveOnes(new int[]{1,1,0,1,1,1},6));
    }
}
