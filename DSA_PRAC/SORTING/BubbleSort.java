package DSA_PRAC.SORTING;
import java.util.Scanner;
public class BubbleSort {
    /*
    In BubbleSort, we compare two adjacent elements from the leftside and oif leftmost is greater than other element, we will swap these two elements.
    in this manner, we will bubble out the biggest element to the rightmost side of array.
    ===================
    Time complexity of BubbleSort is :
    O(n^2)--> Big O of n^2
     */
    public void bubbleSort(int[] array,int size)
    {int temp=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
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
        new BubbleSort().bubbleSort(arr,10);
        for(int i:arr)
            System.out.println(i);
    }
}
