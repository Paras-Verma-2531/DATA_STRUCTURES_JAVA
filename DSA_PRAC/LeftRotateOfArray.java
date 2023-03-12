package DSA_PRAC;
public class LeftRotateOfArray {
    public void rotateLeft(int []arr,int times)
    {
         times=times%arr.length;
        while(times--!=0) {
            int val = arr[0];//copy the val of arr[0] to some var.
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];//shift the elements to its left side::
            arr[arr.length - 1] = val;//place the val into last index
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
       new LeftRotateOfArray().rotateLeft(arr,2);
       for (int i:arr)
           System.out.print(i+" ");
    }
}
