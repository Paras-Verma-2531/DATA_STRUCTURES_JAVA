package DSA_PRAC.Arrays;
import java.util.Arrays;
public class RearrangeArrayBySign {
    /*brute force Approach:: o(2n) sp o(n)
    public void rearrangeArray(int[]arr,int size)
    {
        int[]pos=new int[size/2];
        int[]neg=new int[size/2];
        int k=0,n=0;
        for(int i:arr)
        {
            if(i>0)pos[k++]=i;
            else neg[n++]=i;
        }
        for(int i=0;i<size/2;i++)
        {
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];
        }
    }*/
    //optimal Approach: one pass
    public int[] rearrangeArray(int[]arr,int size)
    {
        int[]new_Arr=new int[size];
        int neg=1,pos=0;
        for(int i:arr)
        {
            if(i>0){new_Arr[pos]=i;pos+=2;}
            else {new_Arr[neg]=i;neg+=2;}
        }return new_Arr;
    }
    public static void main(String[] args) {
        int[]arr={-1,-2,-3,3,4,5};
        System.out.println(Arrays.toString(new RearrangeArrayBySign().rearrangeArray(arr,6)));
    }
}
