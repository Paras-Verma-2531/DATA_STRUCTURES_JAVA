package DSA_PRAC.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
//    public int getindex(Map<Integer,Integer> map, int value, int oldkey)// returns the key
//    {
//        for(int key:map.keySet())
//        {
//            if(map.get(key)==value&&key!=oldkey)
//                return key;
//        }return -1;
//    }
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer>map=new HashMap<>();
//        for(int i=0;i<nums.length;i++)// add the index and element into map
//            map.put(i,nums[i]);
//
//        Arrays.sort(nums);//sort the array
//        int[] arr=new int[2];
//        int i=0,j=nums.length-1;int val1=0,val2=0;
//        while(i<j)// binary search
//        {
//            if(nums[i]+nums[j]==target)
//            {
//                val1=nums[i];
//                val2=nums[j];
//                break;
//            }
//            if(nums[i]+nums[j]>target)
//                j--;
//            if(nums[i]+nums[j]<target)
//                i++;
//        }
//        arr[0]=getindex(map,val1,-1);// stores index
//        arr[1]=getindex(map,val2,arr[0]);
//        return arr;
//    }
    /*brute force approach:
public int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length-1;i++)
    {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==target)return new int[]{i,j};
        }
    }return new int[]{-1,-1};
}

     */
    //better approach:
public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer>map=new HashMap<>();
    //map.put(0,0);
    for(int i=0;i<nums.length;i++)
    {
        if(map.containsKey(target-nums[i]))return new int[]{i,map.get(target-nums[i])};
        map.put(nums[i],i);
    }
    return new int[]{-1,-1};
}
}

