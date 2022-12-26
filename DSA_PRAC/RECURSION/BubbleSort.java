package DSA_PRAC.RECURSION;
import java.util.Arrays;

import static DSA_PRAC.SORTING.QuickSort.swap;
public class BubbleSort {
    public static void bubbleSort(int[]arr,int row,int col)
    {
        if(row==-1)return;//whole array is traversed [n times]
        if(col<row)// does the work of internal loop [ for comparison]
        {
            if(arr[col]>arr[col+1])swap(arr,col,col+1);
            bubbleSort(arr,row,col+1);
        }
        else
            bubbleSort(arr,row-1,0);
    }
    public static void main(String[] args) {
          int[]arr={9,8,7,6,5,4,3,2,1,10};
          bubbleSort(arr,9,0);
        System.out.println(Arrays.toString(arr));
    }
}
