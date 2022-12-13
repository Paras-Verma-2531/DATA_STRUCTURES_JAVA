package Sorting;
public class Quick_Sort {
//     public int partition(int[]array,int initial,int end)
//     {
//         int start=initial;int end_p=end;int pivot=array[initial];
//         while(start<end_p) {
//             while ( start<=end_p &&array[start] <= pivot)start++;
//             while (array[end_p] > pivot)end_p--;
//             if (start < end_p) {
//                 int temp = array[start];
//                 array[start] = array[end_p];
//                 array[end_p] = temp;
//             }
//         }
     public int partition(int[]array,int initial,int end)
    {
        int start=initial;int end_p=end;int pivot=array[end];
        while(start<end_p) {
            while ( start<=end_p &&array[start] <pivot)start++;
            while (end_p>start&&array[end_p]>=pivot)end_p--;
            if (start < end_p) {
                int temp = array[start];
                array[start] = array[end_p];
                array[end_p] = temp;
            }
        }
        int temp = array[initial];
        array[initial]=array[end_p];
        array[end_p]=temp;
        return end_p;
    }
    public void QuickSort(int []array,int initial,int end) {
        if (initial < end) {
            int pivot = partition(array, initial, end);
            QuickSort(array, initial, pivot - 1);
            QuickSort(array, pivot + 1, end);
        }
    }
}
