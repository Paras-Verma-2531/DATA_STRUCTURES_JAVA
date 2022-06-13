package DSA_PRAC.SEARCHING;
import java.util.Arrays;
import java.util.Scanner;
public class BinaryRecursion {
    private int element;
    public int binarySearch(int[]array,int lb,int ub,int element)
    {
        if(lb>ub)
            return -1;
        int mid=(lb+ub)/2;
        if(array[mid]==element)
            return mid;
        if(array[mid]<element)
            return binarySearch(array,mid+1,ub,element);
        return binarySearch(array,lb,mid-1,element);
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
        int[] array=new int[10];
        BinaryRecursion br= new BinaryRecursion();
        br.inputElement(array,10);
        Arrays.sort(array);
        int res=br.binarySearch(array, 0,9,br.element);
        System.out.println(res!=-1?"the element is present at "+(res+1)+" location":"element is not present");
    }
}
