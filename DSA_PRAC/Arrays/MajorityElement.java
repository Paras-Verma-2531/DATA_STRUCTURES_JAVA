package DSA_PRAC.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// Ques: find the element which appears for more than size/2;
public class MajorityElement {
    /*brute force Approach :: O(n^2)
    public int majorityElement(int[]arr,int size)
    {
        int count=1;
        //traverse in the entire array for each element
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)//count the frequency of each arr[i]
            {
                if(arr[i]==arr[j])count++;
            }if(count>size/2)return arr[i];
        }return -101;
    }*/
    /*better Approach using hashing::
    public int majorityElement(int[]arr,int size)
    {
        Map <Integer,Integer> map=new HashMap <>();
        for(int i :arr)
            map.put(i,map.getOrDefault(i,0)+1);
        Iterator<Integer>it=map.keySet().iterator();
        while(it.hasNext())
        {
                int key=it.next();
                if(map.get(key)>size/2)return key;
        }return -101;
    }*/
    //best Approach : On(2n) sp o(1)
    // Moore's Voting Algorithm
    public int majorityElement(int[]arr,int size)
    {
        int count=0,ele=-11;
        for(int i:arr)
        {
            if (count==0)
            {
                ele=i;count=1;
            }
            else if(i==ele)count++;
            else count--;
        }count=0;
        for(int i:arr)
        {
            if(i==ele)count++;
        }
        return count>size/2?ele:-101;
    }
    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{1,3,3,4,5,3,3,3,3,5},10));
    }
}
