package DSA_PRAC.RECURSION;
import java.util.Arrays;
import static DSA_PRAC.SORTING.QuickSort.swap;
public class QuickSort {
    public void quickSort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int pivot=partition(array,start,end);
            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }
    private int partition(int[] array, int start, int end) {
        int element = array[start];
        int initial = start, last = end;
        while (initial <last) {
            while ( initial<=last&&array[initial] <= element) initial++;
            while (array[last] > element) last--;
            if (initial < last) swap(array, initial, last);
        }
        swap(array,start,last);return last;
    }
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        new QuickSort().quickSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }
}
