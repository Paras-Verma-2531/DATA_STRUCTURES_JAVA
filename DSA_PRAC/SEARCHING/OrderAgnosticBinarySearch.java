package DSA_PRAC.SEARCHING;
public class OrderAgnosticBinarySearch {
    public  static boolean binarySearch(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        boolean isAscen=arr[start]<arr[end];// will be true if the array is ascending order
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return true;
            if(isAscen)// Ascending Order Array
            {
                if(arr[mid]<target)start=mid+1;
                else
                    end=mid-1;
            }// for descending order array
            else
            {
                if(arr[mid]<target)end=mid-1;
                else
                    start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(OrderAgnosticBinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9},6));
        System.out.println(OrderAgnosticBinarySearch.binarySearch(new int[]{10,9,8,7,6,5,4,3,2,1},100));
    }
}
