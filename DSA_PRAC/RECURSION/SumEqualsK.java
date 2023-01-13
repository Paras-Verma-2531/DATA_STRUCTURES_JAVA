package DSA_PRAC.RECURSION;

public class SumEqualsK {
    //all the subsequence with sum==k
//    public static void sumEqualsK(int[]arr, ArrayList<Integer>list,int index, int sum, int currsum)
//    {
//        if(index==arr.length){if(currsum==sum) System.out.println(list);return;}
//        list.add(arr[index]);//add the element in the list --->taking
//        currsum+=arr[index];//add it to the currsum as well
//        sumEqualsK(arr,list,index+1,sum,currsum);//pass with additional included sum::
//        list.remove(list.size()-1);//remove from the list
//        currsum-=arr[index];//subtract from curr_sum; --->not taking
//        sumEqualsK(arr,list,index+1,sum,currsum);
//    }
    /*if either the one sol exists return true;
    public static boolean sumEqualsK(int[]arr, ArrayList<Integer>list,int index, int sum, int currsum)
    {
        if(index==arr.length)
        {if(currsum==sum){
            //condition satisfied
            System.out.println(list);return true;
        }return false;
        }
        list.add(arr[index]);//add the element in the list --->taking
        currsum+=arr[index];//add it to the currsum as well
        if(sumEqualsK(arr,list,index+1,sum,currsum))return true;//pass with additional included sum::
        list.remove(list.size()-1);//remove from the list
        currsum-=arr[index];//subtract from curr_sum; --->not taking
        return sumEqualsK(arr, list, index + 1, sum, currsum);
    }
    */
    //return no of count's::
    public static int sumEqualsK(int[] arr, int index, int sum, int currsum) {
        if (index == arr.length) {
            if (currsum == sum) return 1;
            return 0;
        }
        currsum += arr[index];//add it to the currsum as well
        int left = sumEqualsK(arr, index + 1, sum, currsum);//pass with additional included sum::
        currsum -= arr[index];//subtract from curr_sum; --->not taking
        int right = sumEqualsK(arr, index + 1, sum, currsum);
        return left + right;
    }
    public static void main(String[] args) {
        System.out.println(SumEqualsK.sumEqualsK(new int[]{1, 2, 1}, 0, 2, 0));
    }
}
