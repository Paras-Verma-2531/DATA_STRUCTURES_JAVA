package DSA_PRAC.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement_size_k {
    public void DistinctElementInSize(int[] array,int size)
    {
        Set<Integer> set= new HashSet<>();int k=size;
        // good approach still it uses O(n^2) could have been optimised using hashMap

        for(int i=0;i<array.length-size;i++)
        {
            //System.out.println("i :"+i);
            //System.out.println("size :"+size);
            for(int j=i;j<k;j++)
            {
                set.add(array[j]);
            }
            System.out.println(set.size());
            set.clear();
            k++;
        }
    }

    public static void main(String[] args) {
        //count no of distinct elements in array of window size k;
        new CountDistinctElement_size_k().DistinctElementInSize(new int[]{1,2,2,1,3,1,4,5,3,1},4);
    }
}
