package DSA_PRAC.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class majorityElement_II {
    /* brute force::
    public int[] majorityElement(int[]arr,int size)
    {
        int[]ans=new int[2];int k=0;
        for(int i=0;i<size;i++)
        {
            int count=1;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]==arr[i])count++;
            }if(count>size/3)ans[k++]=arr[i];
        }return ans;
    }*/
    // better Approach::
    public int[] majorityElement(int[]arr,int size)
    {
        int[]ans=new int[2];int k=0,min_val=size/3+1;
        Map <Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==min_val)ans[k++]=i;
        }return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new majorityElement_II().majorityElement(new int[]{1,1,1,4,1,3,3,3,3,5},10)));
    }
}
