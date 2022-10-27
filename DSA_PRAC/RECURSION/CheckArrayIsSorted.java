package DSA_PRAC.RECURSION;
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(new CheckArrayIsSorted().checkSorted(new int[]{1,2,3,4,5,6,5,8,9,10},0,9));
    }
    public boolean checkSorted(int[]arr,int start,int end)
    {
        if(start==end)return true;//base condition
        if(arr[start]<=arr[start+1])//for sorted Array arr[start] is always <=arr[start+1]
            return checkSorted(arr,start+1,end);
        return false;//else return false;
    }
}
