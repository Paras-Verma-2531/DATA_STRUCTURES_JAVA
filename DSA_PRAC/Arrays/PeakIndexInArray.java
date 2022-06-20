package DSA_PRAC.Arrays;

public class PeakIndexInArray {
    public int peakIndexInArray(int[] arr)
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])// since if mid-element is< mid+1:: then all element in <mid would also be smaller therefore start=mid+1;
                start=mid+1;
            else
                end=mid;
        }return start;
    }
    public static void main(String[] args) {
        // works for mountain arrays::[sorted]// non-repetitive
        int index=new PeakIndexInArray().peakIndexInArray(new int[]{8,9,10,7,6,5});
        System.out.println("the peak index is :"+index);
    }
}
