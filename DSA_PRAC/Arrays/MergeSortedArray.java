package DSA_PRAC.Arrays;

public class MergeSortedArray {
    public int[] mergeArrays(int[] array1,int size1,int[]array2,int size2)
    {
        /*first approach
        int [] array=new int[size1+size2];
        int i=0,j=0,k=0;
        while(i<size1&&j<size2)
        {
            if(array1[i]<array2[j])
                array[k++]=array1[i++];
            else
                array[k++]=array2[j++];
        }
        while(i<size1)
            array[k++]=array1[i++];
        while(j<size2)
            array[k++]=array2[j++];
        for(i=0;i<size1+size2;i++)
            array1[i]=array[i];
        return array1;
         */
        //2nd approach
        // since the arrays are sorted therefore, start comparing from last element: if any of them is greater move it to last index;
        int i=size1-1,j=size2-1,k=size1+size2-1;
        while(j>=0)
        {
            if(i>=0)
            {
                if(array1[i]>array2[j])
                    array1[k--]=array1[i--];
                else
                    array1[k--]=array2[j--];
            }else
            {
                break;
            }
        }return array1;
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,0,0,0};
        int[] array2={2,5,6};
        array1=new MergeSortedArray().mergeArrays(array1,3,array2,3);
        for(int i:array1)
            System.out.println(i);

    }
}
