import Sorting.*;
import java.util.Scanner;
public class Sorting_Main {
    public void display(int array[],int size)
    {
        System.out.println("sorted array is: ");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        bubble_Sort bl=new bubble_Sort();
        Selection_Sort sl=new Selection_Sort();
        //sl.SelectionSort(array,size);
        //bl.bubbleSort(array,size);
        Merge_Sort mr=new Merge_Sort();
        //mr.mergeSort(array,0,size-1);
        Quick_Sort qs= new Quick_Sort();
        int[]array={10,9,8,7,6,5,4,3,2,1};
        qs.QuickSort(array,0,9);
        new Sorting_Main().display(array,10);
    }
}
