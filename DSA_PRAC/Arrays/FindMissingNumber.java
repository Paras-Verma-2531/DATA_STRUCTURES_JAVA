package DSA_PRAC.Arrays;
public class FindMissingNumber {
    //brute force Approach::
    /*
    public int findMissingNumber(int []arr,int size)
    {
        for(int i=1;i<=size;i++) // -------------> O(n^2)
        {//for every number traverse in the array
            boolean flag=false;
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]==i){
                    flag=true;
                    break;
                }//if number does not exist flag remains false
            }
            if(!flag)return i;
        }return -1;
    }
    //Better Approach using Extra Space
    public int findMissingNumber(int []arr,int size)
    {
        int[] new_arr=new int[size+1];// an array for 1 to <=n elements
        for(int j=0;j<size-1;j++)
            new_arr[arr[j]]=1;// for all elements in arr set new_arr as 1;
        for(int i=1;i<size+1;i++)
            if(new_arr[i]!=1)return i;
        return -1;
    }*/
    //Optimised Approach using sum method:
    public int findMissingNumber(int []arr,int size)
    {
        int sum=(size*(size+1))/2; int newsum=0;
        for(int j=0;j<size-1;j++) // -------------> O(n)
            newsum+=arr[j];
        return sum-newsum;// the difference between the assumed sum and the actual sum would be the missing number:
    }
    public static void main(String[] args) {
        System.out.println(new FindMissingNumber().findMissingNumber(new int[]{1,2,4,5},5));
    }
}
