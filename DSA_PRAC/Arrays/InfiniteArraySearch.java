package DSA_PRAC.Arrays;

public class InfiniteArraySearch {
    public static int binarySearch(int[] array,int start,int end,int element)
    {
        if(start>end)return -1;
         int mid=(start+end)/2;
         if(array[mid]==element)return mid;
         if(array[mid]>element)
             return binarySearch(array,start,mid-1,element);
         return binarySearch(array,mid+1,end,element);
    }
    public int infiniteArraySearch(int[] array,int element)
    {
        int start=0;
        int high=1;
        while(array[high]<element)
        {
            start=high;
            high=2*high;// only works for infinite size array[otherwise OutOfBound Exception]
        }
        return binarySearch(array,start,high,element);
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        int res=new InfiniteArraySearch().infiniteArraySearch(array,10);
        System.out.println(res!=-1?"the element is present at "+(res+1)+ " position ":"element not present");
    }
}
