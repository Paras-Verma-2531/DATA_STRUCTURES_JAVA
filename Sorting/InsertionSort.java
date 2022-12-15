package Sorting;
public class InsertionSort {
    public void insertionSort(int[]arr,int size)
    {
        for(int i=1;i<size;i++)
        {
            int data=arr[i];int k=i-1;
            while(k>=0&&arr[k]>=data)
                arr[k+1]=arr[k--];
            arr[k+1]=data;

        }
    }
    public static void main(String[] args) {
        int[] arr={110,9,8,7,6,5,4,3,2,1};
        new InsertionSort().insertionSort(arr,10);//anonymous object used for method calling
        for(int i: arr)
            System.out.println(i);
    }
}
