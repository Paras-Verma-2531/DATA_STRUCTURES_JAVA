package DSA_PRAC.Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class UnionOfTwoSortedArray {
    //brute force Approach::
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
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new UnionOfTwoSortedArray().union(new int[]{1,2,3,4,5},new int[]{2,3,4,5,6,7,7})));
    }
}
