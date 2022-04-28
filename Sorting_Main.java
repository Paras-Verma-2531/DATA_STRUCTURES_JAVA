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
    public void inputElements(int array[],int size)
    {Scanner in=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.print("enter the "+(i+1) +" element: ");
            array[i]=in.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size;
        System.out.print("enter the size of array: ");
        size=in.nextInt();
        int array[]=new int[size];
        Sorting_Main sort=new Sorting_Main();
        sort.inputElements(array,size);
        bubble_Sort bl=new bubble_Sort();
        Selection_Sort sl=new Selection_Sort();
        sl.SelectionSort(array,size);
        //bl.bubbleSort(array,size);
        sort.display(array,size);
    }
}
