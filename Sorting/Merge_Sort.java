package Sorting;
public class Merge_Sort {
    public void merge(int array[],int initial,int mid,int end) {
        int size1 = mid - initial + 1;
        int size2 = end - mid;
        int array1[] = new int[size1];
        int array2[] = new int[size2];
        for (int i = 0; i < size1; i++) {
            array1[i] = array[initial + i];
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = array[mid + i + 1];
        }
        int pointer1, pointer2;
        pointer1 = pointer2 = 0;
        int i = initial;
        while (pointer1 < size1 && pointer2 < size2) {
            if (array1[pointer1] <= array2[pointer2]) {
                array[i] = array1[pointer1];i++;pointer1++;
            }
            else
            {
                array[i]=array2[pointer2];
                i++;pointer2++;
            }
        }
        while(pointer1<size1)
        {
            array[i]=array1[pointer1];i++;pointer1++;
        }
        while(pointer2<size2)
        {
            array[i]=array2[pointer2];i++;pointer2++;
        }
    }
    public void mergeSort(int array[],int initial,int end)
    {
        if(initial<end)
        {
            int mid=(initial+end)/2;
            mergeSort(array,initial,mid);
            mergeSort(array,mid+1,end);
            merge(array,initial,mid,end);
        }
    }
}
