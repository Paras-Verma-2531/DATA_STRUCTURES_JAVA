package DSA_PRAC.Arrays;
public class LeftRotateAnArray {
    public static void swap(int[] array,int i, int j)// swap an array
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public void leftRotateArray(int[] array,int noOfTimes)// rotate as per user choice
    {
        /*
        since if we rotate the array by its own size there will
        be no change, thus to reduce computations[% of size is considered]
         */
        int actualRotation=noOfTimes%array.length;
        if(actualRotation>1)
        {
            while (actualRotation--!=0)
            {
                int temp=array[0];
                for(int i=1;i<array.length;i++)
                    array[i-1]=array[i];
                array[array.length-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        new LeftRotateAnArray().leftRotateArray(array,3);
        for(int i:array)
            System.out.println(i);
    }
}
