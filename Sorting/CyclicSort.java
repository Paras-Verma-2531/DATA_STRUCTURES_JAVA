package Sorting;
public class CyclicSort {
    /*
    ===========================================
    Only works when a range of number is given like [1,n]
    TC-->O(N)
    ------------------------------------------------
    Basic intuition is when an array is sorted all the elements would be at its right index i,e arr[i]==i+1
    And if they are not equal swap the i and arr[i]-1 index values
    :: if they are equal make i++
    ==================================
     */
    public static int swap(int[]arr,int i,int j)
    {// A method which swaps the value at given index
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return 0;
    }
    public static void cyclicSort(int[]arr,int size)
    { int i=0;
        while(i<size/2)// run the loop till n/2 [since for n/2 we will be swapping 2*n/2 i,e n numbers thus whole array is swapped]
        {Object o=arr[i] == (i + 1)?i++:swap(arr,i,arr[i] - 1);}
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1};
        cyclicSort(arr,5);
        for(int i:arr)
            System.out.println(i);
    }
}
