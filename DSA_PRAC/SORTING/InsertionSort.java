package DSA_PRAC.SORTING;

import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] array)
    {
        int k=0;
        for(int i=1;i<=9;i++)
        {
            int temp=array[i];
            k=i-1;
            while(k>=0&&array[k]>temp)
            {
                //System.out.println("value of k "+array[k]+ " is transferred to "+array[k+1]);
                array[k+1]=array[k];
                //System.out.println("value of k is "+k);
                k--;
            }array[k+1]=temp;
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
        new InsertionSort().insertionSort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
