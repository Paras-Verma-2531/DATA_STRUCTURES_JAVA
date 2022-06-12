package DSA_PRAC.SORTING;
import java.util.Scanner;
public class QuickSort {
    public static void swap(int[]array,int pos1,int pos2)
    {
        int temp=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=temp;
    }
    public int partition(int[] array,int initial,int end)
    {
         int start=initial;int end_pos=end;int pivot=array[initial];
         while(array[start]<=pivot)
             start++;// increment start till a[start]<=pivot
         while (array[end_pos]>pivot)
             end_pos--;// decrement end_pos till a[end_pos]>pivot
         if(start<end_pos)
             swap(array,start,end_pos);// only swap when start<end_pos
         else
             swap(array,initial,end_pos);
         return end_pos;// return end_pos[actual position of pivot element]
    }
    public void quickSort(int[] array,int initial,int end)
    {
           if(initial<end)
           {
               int pivot=partition(array,initial,end);
               quickSort(array,initial,pivot-1);
               quickSort(array,pivot+1,end);
           }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("enter the "+(i+1)+" number: ");
            arr[i]=in.nextInt();
        }
        new MergeSort().mergeSort(arr,0,9);
        for(int i:arr)
            System.out.println(i);
    }
}
