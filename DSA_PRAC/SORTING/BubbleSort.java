package DSA_PRAC.SORTING;

import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort(int[] array)
    {int temp=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
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
            System.out.println("enter the "+(i+1)+" number");
            arr[i]=in.nextInt();
        }
        new BubbleSort().bubbleSort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
