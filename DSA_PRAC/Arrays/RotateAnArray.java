package DSA_PRAC.Arrays;
public class RotateAnArray {
    public static void swap(int[] array,int i, int j)// swap an array
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public void rotateArray(int[] array,int noOfTimes)// rotate as per user choice
    {
        int i=0,j=array.length-1;
        while(noOfTimes!=0)
        {
            swap(array,i++,j--);
            noOfTimes--;
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        new RotateAnArray().rotateArray(array,3);
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}
