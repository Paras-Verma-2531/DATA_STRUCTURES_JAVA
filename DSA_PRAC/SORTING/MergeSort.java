package DSA_PRAC.SORTING;
import java.util.Scanner;
public class MergeSort {
    public void merge(int[] arr,int initial,int mid,int end)
    {
        int size1=mid-initial+1;
        int size2=end-mid;
        int[] temp1=new int[size1];
        int[] temp2=new int[size2];
        for(int i=0;i<size1;i++)
        {
            temp1[i]=arr[i+initial];
        }
        for(int i=0;i<size2;i++)
        {
            temp2[i]=arr[mid+1+i];
        }
        int pointer1=0;int pointer2=0;
        int i=initial;
        while(pointer1<size1&&pointer2<size2)
        {
            if(temp1[pointer1]<=temp2[pointer2])
            {
                arr[i]=temp1[pointer1];i++;pointer1++;
            }
            else
            {
                arr[i]=temp2[pointer2];i++;pointer2++;
            }
        }
        while(pointer1<size1)
        {
            arr[i]=temp1[pointer1];i++;pointer1++;
        }
        while(pointer2<size2)
        {
            arr[i]=temp2[pointer2];i++;pointer2++;
        }
    }
    public void mergeSort(int[] arr,int initial,int end) {
        if (initial < end) {
            int mid = (initial + end) / 2;
            mergeSort(arr, initial, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, initial, mid, end);
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
        {
            System.out.println(i);
        }

    }
}
