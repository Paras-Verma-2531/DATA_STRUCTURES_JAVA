package DSA_PRAC.Arrays;
import static DSA_PRAC.Arrays.RotateAnArray.swap;
public class MoveZerosToEnd {
    public void moveZerosToEnd(int []arr)
    {
        int j=-1;//stores first zero index
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;break;
            }
        }
        if(j!=-1) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    swap(arr, i, j);// if i is at non zero index swap it with j
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,0,0,0,6,7,8};
        new MoveZerosToEnd().moveZerosToEnd(arr);
        for (int i:arr)
            System.out.print(i+" ");
    }
}
