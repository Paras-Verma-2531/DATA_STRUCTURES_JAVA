package DSA_PRAC.SORTING;
import java.util.Scanner;
public class MergeSort {
    public void merge(int[] arr,int initial,int mid,int end)
    {
        int[] newarr=new int[end-initial+1];
        int i=initial;int j=mid+1;int k=initial;
        while(i<=mid&&j<=end)
        {
            if(arr[i]<arr[j])
                newarr[k]=arr[i++];
            else
                newarr[k]=arr[j++];
            k++;
        }
        while(i<=mid)
            newarr[k++]=arr[i++];
        while(j<=end)
            newarr[k++]=arr[j++];
        for(k=initial;k<=end;k++)
            arr[k]=newarr[k];
    }
    public void mergeSort(int[] arr,int initial,int end) {
        if (initial < end) {
            int mid = (initial + end) / 2;
            mergeSort(arr, initial, mid);//divide the array [initial--mid]
            mergeSort(arr, mid + 1, end);//mid+1---end
            merge(arr, initial, mid, end);//now merge them
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("enter the " + (i + 1) + " number: ");
            arr[i] = in.nextInt();
        }
        new MergeSort().mergeSort(arr, 0, 9);
        for (int i : arr)
            System.out.println(i);
    }
}
