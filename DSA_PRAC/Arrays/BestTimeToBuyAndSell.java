package DSA_PRAC.Arrays;
public class BestTimeToBuyAndSell {
    //dynamic programming::
    public int bestTimeToBuyAndSell(int[]arr,int size)
    {
        int min=arr[0],profit=0,cost=0;
        for(int i=1;i<size;i++)
        {
            cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
        }return profit;
    }
    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSell().bestTimeToBuyAndSell(new int[]{7,1,2,3,6,4,3},7));
    }
}
