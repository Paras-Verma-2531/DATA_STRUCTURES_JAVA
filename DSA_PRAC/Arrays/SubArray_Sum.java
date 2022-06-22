package DSA_PRAC.Arrays;
import java.util.HashMap;
public class SubArray_Sum {
    public void SubArray(int[] array,int sum)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int cursum=0,start=0,end=-1;
        for(int i=0;i<array.length;i++)
        {
            cursum+=array[i];
            if(cursum-sum==0)
            {
                end=i;break;
            }
            if(map.containsKey(cursum-sum))
            {
                start=map.get(cursum-sum)+1;
                end=i;
                break;
            }
            map.put(cursum,i);
        }
        System.out.println("the sum "+sum +" is present in the subArray "+start +" : "+end);
    }

    public static void main(String[] args) {
        // to find subArray with the sum=5;
        new SubArray_Sum().SubArray(new int[]{1,6,3,15,-10,20},5);
    }
}
