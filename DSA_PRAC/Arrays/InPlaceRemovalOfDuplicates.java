package DSA_PRAC.Arrays;

import java.util.Arrays;

public class InPlaceRemovalOfDuplicates {
    public static void removeDuplicates(int[]arr,int size)
    {
         int i=0;
        for(int j=i+1;j<size;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4};
        removeDuplicates(arr,7);
        System.out.println(Arrays.toString(arr));
    }
}
