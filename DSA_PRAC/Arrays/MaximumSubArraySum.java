package DSA_PRAC.Arrays;
public class MaximumSubArraySum {
    /*brute force or better  Approach:: o (n^2)
    public int maximumSubArraySum(int[]arr,int size)
    {int max=0;
        for(int i=0;i<size;i++)
        {int sum=0;
            for(int j=i;j<size;j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
            sum=0;
        }return max;
    }*/
    public int maximumSubArraySum(int[]arr,int size)
    {  int sum=0,max=-1111,start=-1,startIndex=-1,endIndex=-1;
        for(int i :arr)
        {
            if(sum==0)start=i;
            sum+=i;
            if(sum>max)
            {
                startIndex=start;
                endIndex=i;
                max=sum;
            }
         if(sum<0)sum=0;
        }
        return Math.max(max, 0);
    }
    public static void main(String[] args) {
        System.out.println(new MaximumSubArraySum().maximumSubArraySum(new int[]{-1,-2,1,2,3,4,-5,-6},8));
    }
}
