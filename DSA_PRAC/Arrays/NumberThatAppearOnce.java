package DSA_PRAC.Arrays;
public class NumberThatAppearOnce {
    /*brute force Approach:: O(n^2)
    public int numberThatAppearOnce(int[]arr,int size)
    {
        for(int i:arr)//count freq. of every element:
        {int count=0;
            for(int j=0;j<size;j++)
                if(arr[j]==i)count++;
            if(count==1)return i;
        }return -1;
    }*/
    //better Approach:       -------------> O(n) sp O(n)
    public int numberThatAppearOnce(int[]arr,int size)
    {
        int[]hash_Arr=new int[size+1];// extra space used
        for(int i:arr)
            hash_Arr[i]++;//increase the freq of each element if exists mul. times
        for(int i=1;i<size+1;i++)
            if(hash_Arr[i]==1)return i;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(new NumberThatAppearOnce().numberThatAppearOnce(new int[]{1,1,2,3,3,4,4},4));
    }
}
