package DSA_PRAC.RECURSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SubSet_Sum {
    /*
    Returns a list which contains the sum of different subsets::
     */
    private void helper(int[]arr,int index,List<Integer>finalList,int currsum)
    {
        if(index==arr.length){finalList.add(currsum);return;}
        currsum+=arr[index];//includes the current no in the currsum
        helper(arr,index+1,finalList,currsum);
        currsum-=arr[index];//exclude the current no:
        helper(arr,index+1,finalList,currsum);
    }
    public List<Integer>subset(int arr[])
    {
        List <Integer> list=new ArrayList<>();
        helper(arr,0,list,0);
        return list;
    }
    public static void main(String[] args) {
        List<Integer>list=new SubSet_Sum().subset(new int[]{3,1,2});
        Collections.sort(list);
        System.out.println(list);
    }
}
