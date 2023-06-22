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
    //with two temp array
//   private void merge(int[]arr,int start,int mid,int end)
//   {
//       int[]arr1=new int[mid-start+1];
//       int[]arr2=new int[end-mid];
//       for(int i=0;i<arr1.length;i++)
//           arr1[i]=arr[i+start];
//       for(int i=0;i<arr2.length;i++)
//           arr2[i]=arr[i+mid+1];
//       int pos1=0,pos2=0;
//       int k=start;
//       while(pos1<arr1.length&&pos2<arr2.length)
//       {
//           if(arr1[pos1]<=arr2[pos2])arr[k++]=arr1[pos1++];
//           else arr[k++]=arr2[pos2++];
//       }
//       while(pos1<arr1.length)
//           arr[k++]=arr1[pos1++];
//       while (pos2<arr2.length)arr[k++]=arr2[pos2++];
//   }
    private void merge(int[]arr,int low,int mid,int high)
    {
        int left=low;int right=mid+1;
        int[]temp=new int[high-low+1];
        int k=0;
        while(left<=mid&&right<=high)
        {
            if(arr[left]<=arr[right]) {
                temp[k] = arr[left];
                left++;
            }
            else
            {temp[k]=arr[right];right++;}
            k++;
        }
        while(left<=mid) {
            temp[k] = arr[left];
            left++;k++;
        }
        while(right<=high) {
            temp[k] = arr[right];
            right++;k++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        new MergeSort().mergeSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }
}
