package DSA_PRAC.Arrays;
import java.util.HashMap;
import java.util.Map;
public class LongestSubArrayWithSumK {
    /*brute force: O(n^2)
    public int longestSubArrayWithSumK(int[]arr,int size,int k)
    {
        int longest=0;
        for(int i=0;i<size;i++)// for each element traverse in the entire array
        { int count=0,sum=0;
            for(int j=i;j<size;j++)// traverse from i to n :: subarray is contiguous
            {
                sum+=arr[j];count++;
                if(sum>k)break;
                if(sum==k)longest=Math.max(longest,count);
            }count=0;sum=0;
        }return longest;
    }*/
    //better Approach:
    public int longestSubArrayWithSumK(int[]arr,int size,int k)
    {
        Map <Integer,Integer> prefix=new HashMap();
        int sum=0,longest=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
            if(prefix.containsKey(sum-k))longest=Math.max(longest,i-prefix.get(sum-k));
            prefix.put(sum,i);
        }return longest;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubArrayWithSumK().longestSubArrayWithSumK(new int[]{1,2,1,1,1,3},6,3));
    }
}
