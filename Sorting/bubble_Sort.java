package Sorting;
public class bubble_Sort {
    public void bubbleSort(int array[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    array[j]=array[j]^array[j+1];
                    array[j+1]=array[j+1]^array[j];
                    array[j]=array[j]^array[j+1];
                }
            }
        }
    }

}
