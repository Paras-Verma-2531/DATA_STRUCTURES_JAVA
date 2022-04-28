package Sorting;

public class Selection_Sort
{
    public void SelectionSort(int array[],int size)
    { int temp=0;
        for(int i=0;i<size-1;i++)
        { int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(array[min]>array[j]){min=j;}
            }
            temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
}

