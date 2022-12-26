package DSA_PRAC.RECURSION;
public class RotatedBinarySearch {
    public int rotatedBinarySearch(int[]arr,int target,int start,int end)
    {
        if(start>end)return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return mid;
        //first half is sorted
        if(arr[start]<=arr[mid])
        {
            //element lies in first half
            if(target>=arr[start]&&target<=arr[mid])return rotatedBinarySearch(arr,target,start,mid-1);
            return rotatedBinarySearch(arr,target,mid+1,end);//lies in second half
        }
        //second half is sorted
        else {
            if(target>=arr[mid]&&target<=arr[end])return rotatedBinarySearch(arr,target,mid+1,end);
            return rotatedBinarySearch(arr,target,start,mid-1);
        }
    }public static void main(String[] args) {
        System.out.println(new RotatedBinarySearch().rotatedBinarySearch(new int[]{5,6,7,8,9,1,2,3},9,0,7));
    }
}
