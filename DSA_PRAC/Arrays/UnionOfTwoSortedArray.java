package DSA_PRAC.Arrays;
import java.util.*;

public class UnionOfTwoSortedArray {
    /*brute force Approach::
    public int[] union(int[]arr1,int[]arr2)
    {
        Set <Integer> set=new HashSet<>();
        for(int i:arr1)
            set.add(i);
        for(int i:arr2)
            set.add(i);
        int []new_arr=new int[set.size()];
        Iterator<Integer>it=set.iterator();
        int j=0;
        while(it.hasNext())
            new_arr[j++]=it.next();
        return new_arr;
    }*/
    public Object[] union(int[]arr1,int[]arr2)
    {
        int i=0,j=0,k=-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(k==-1||list.get(k)!=arr1[i])
                {
                    list.add(arr1[i]);k++;
                }i++;
            }
            else {
                if(k==-1||list.get(k)!=arr2[j])
                {
                    list.add(arr2[j]);k++;
                }j++;
            }
        }
        if(i<arr1.length)
        {
            while(i<arr1.length)
            {
                if(k==-1||list.get(k)!=arr1[i])
                {
                    list.add(arr1[i]);k++;
                }i++;
            }
        }
        if(j<arr2.length)
        {
            while(j<arr2.length)
            {
                if(k==-1||list.get(k)!=arr2[j])
                {
                    list.add(arr2[j]);k++;
                }j++;
            }

        }return list.toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new UnionOfTwoSortedArray().union(new int[]{1,2,3,4,5},new int[]{2,3,4,5,6,7,7})));
    }
}
