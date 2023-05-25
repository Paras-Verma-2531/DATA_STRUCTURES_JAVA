package DSA_PRAC.SORTING;
import java.util.Scanner;
public class SelectionSort {
    public void selectionSort(int[]array,int size)
    {
        for(int i=0;i<size-1;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(array[j]<array[i])min=j;
            }
            //swap the values::
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("Enter ten numbers:");
        for(int i=0;i<10;i++)
            arr[i]=in.nextInt();
        new SelectionSort().selectionSort(arr,10);
        for(int i:arr)
            System.out.println(i);
    }
}
