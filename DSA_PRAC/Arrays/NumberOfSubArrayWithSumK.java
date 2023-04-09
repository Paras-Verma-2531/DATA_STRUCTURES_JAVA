package DSA_PRAC.Arrays;
import java.util.HashMap;
import java.util.Map;
public class NumberOfSubArrayWithSumK {
    /*brute force::
    public int numberOfSubArrayWithSumK(int[]arr,int size,int k)
    {int length=0;
        for(int i=0;i<size;i++)
        {
            int sum=0;
            for(int j=i;j<size;j++)
            {
                sum+=arr[j];
                if(sum==k) length++;
            }
        }return  length;
    }*/
    // optimal approach::
    public int numberOfSubArrayWithSumK(int[]arr,int k)
    {
        Map<Integer,Integer>map=new HashMap<>();
        int length=0,sum=0;
        map.put(0,1);
        for(int i:arr)
        {
            sum+=i;
            if(map.containsKey(sum-k))length+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }return length;
    }
    public static void main(String[] args) {
        System.out.println(new NumberOfSubArrayWithSumK().numberOfSubArrayWithSumK(new int[]{1,2,3,-3,1,1,1,4,2,-3},3));
    }
}
