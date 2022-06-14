package DSA_PRAC.Arrays;
public class reverseOfArray {
    public static void swap(int[] array,int i , int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void reverse(int[] array,int start,int end)
    {
        while(start<end)
        {
            swap(array,start,end);
            start++;end--;
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        reverseOfArray.reverse(array,0,9);
        for(int i: array)
        {
            System.out.println(i);
        }
    }

}
