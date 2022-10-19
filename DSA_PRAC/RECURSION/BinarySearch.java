package DSA_PRAC.RECURSION;
public class BinarySearch {
    public int binarySearch(int[]array,int key,int start,int end)
    {
        if(start>end)return -1;//we have traversed the whole array
        int mid=start+(end-start)/2;//calculate mid
        if(array[mid]>key)return binarySearch(array,key,start,mid-1);//if key<arr[mid] search in left side
        if(array[mid]==key)return mid;//equals to mid
        return binarySearch(array,key,mid+1,end);//search in right side
    }
    public static void main(String[] args) {
        System.out.println(new BinarySearch().binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10},6,0,9));
    }
}
