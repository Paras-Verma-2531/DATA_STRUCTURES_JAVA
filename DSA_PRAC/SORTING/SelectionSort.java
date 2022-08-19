package DSA_PRAC.SORTING;
import java.util.Scanner;
public class SelectionSort {
    public void selectionSort(int[] array,int size)
    { int min=0;
        for(int i=0;i<size-1;i++)
        {
            min=i;
            for(int j=i+1;j<size;j++)
            {
                if(array[j]<array[min])//search for the minimum element
                    min=j;//make min as index of minimum element
            }
            int temp=array[i];//swap arr[min] with arr[i]
            array[i]=array[min];
            array[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("enter the "+(i+1)+ " number :");
            arr[i]=in.nextInt();
        }
        new SelectionSort().selectionSort(arr,10);
        for(int i:arr)
            System.out.println(i);
    }
}
