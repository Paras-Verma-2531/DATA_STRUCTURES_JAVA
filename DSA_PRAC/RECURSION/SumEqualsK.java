package DSA_PRAC.RECURSION;
import java.util.ArrayList;
public class SumEqualsK {
    public static void sumEqualsK(int[]arr, ArrayList<Integer>list,int index, int sum, int currsum)
    {
        if(index==arr.length){if(currsum==sum) System.out.println(list);return;}
        list.add(arr[index]);//add the element in the list --->taking
        currsum+=arr[index];//add it to the currsum as well
        sumEqualsK(arr,list,index+1,sum,currsum);//pass with additional included sum::
        list.remove(list.size()-1);//remove from the list
        currsum-=arr[index];//subtract from curr_sum; --->not taking
        sumEqualsK(arr,list,index+1,sum,currsum);
    }
    public static void main(String[] args) {
        SumEqualsK.sumEqualsK(new int[]{1,2,1},new ArrayList<Integer>(),0,2,0);
    }
}
