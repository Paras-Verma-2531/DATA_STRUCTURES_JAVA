package DSA_PRAC.SORTING;
import java.util.Scanner;
public class InsertionSort {
    public void insertionSort(int[] array,int size)
    {int k=0;
        for(int i=1;i<size;i++)
        {
            int temp=array[i];
            k=i-1;// stores the index i,e where to begin
            while(k>=0&&array[k]>temp)
            {
                //System.out.println("value of k "+array[k]+ " is transferred to "+array[k+1]);
                array[k+1]=array[k];
                //System.out.println("value of k is "+k);
                k--;
            }array[k+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=in.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
         arr[i]=in.nextInt();
        new InsertionSort().insertionSort(arr,size);
        for(int i:arr)
            System.out.println(i);
    }
}
