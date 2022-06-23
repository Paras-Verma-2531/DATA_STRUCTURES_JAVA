package DSA_PRAC.Arrays;
public class RemoveDuplicates_SortedArray {
    public int RemoveDuplicates(int[] array)
    {int k=1;
        for(int i=1;i<array.length;i++)
        {
            int j=i-1;
            if(array[i]==array[j]) {
            }
            else
                array[k++]=array[i];
        }
        return k;
    }

    public static void main(String[] args) {
        // remove duplicates from the sorted array and return the size of array
        // do not use extra array:
        System.out.println(new RemoveDuplicates_SortedArray().RemoveDuplicates(new int[]{1,1,2,3,4,4,5,6}));

    }
}
