package DSA_PRAC.RECURSION;
import java.util.Arrays;
public class MergeSort {
    public void mergeSort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }
    private void merge(int[] arr,int start,int mid,int end)
    { int[] newarr=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid&&j<=end)
        {
            if(arr[i]<arr[j]){newarr[k]=arr[i];i++;}
            else
            { newarr[k]=arr[j];j++;}
            k++;
        }
        while(i<=mid)newarr[k++]=arr[i++];
        while(j<=end)newarr[k++]=arr[j++];
        for(k=start;k<=end;k++)arr[k]=newarr[k-start];
    }
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        new MergeSort().mergeSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }
}
