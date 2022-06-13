package DSA_PRAC.SEARCHING;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    /*
    BinarySearch provides an optimisation over linear search.  it searches an element in log(n) time. it only works on sorted arrays.
    it compares an element with mid and performs corresponding operations.

     */
    private  int element;
    public int binarySearch(int[] array,int element)
    {
        Arrays.sort(array);
        int lb= 0;
        int ub=array.length-1;
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(array[mid]>element)
                ub=mid-1;
            if(array[mid]<element)
                lb=mid+1;
            if(array[mid]==element)
                return mid;
        }return -1;
    }
    public void inputElement(int[]array,int size)
    {
        Scanner in= new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.print("enter the "+(i+1)+ " element : ");
            array[i]=in.nextInt();
        }
        System.out.print("enter the element to be searched: ");
        element=in.nextInt();
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array=new int[10];
        bs.inputElement(array,10);
        int res=bs.binarySearch(array, bs.element);
        System.out.println(res!=-1?"the element is present at "+(res+1)+" location":"element is not present");
    }
}
 