package DSA_PRAC.Arrays;
import java.util.Arrays;
public class SortArrayOfZerosOnesAndTwos {
    // brute force Approach : O(nlogn) --> sorting
    /*better Approach : O(n)
    public void sortArray(int[]arr,int size)
    {
        int zeros=0,ones=0,twos=0;
        for(int i: arr)
        {
            if(i==0)zeros++;
            else if(i==1)ones++;
            else twos++;
        }
        Arrays.fill(arr,0,zeros,0);
        Arrays.fill(arr,zeros,zeros+ones,1);
        Arrays.fill(arr,zeros+ones,size,2);
    }*/
    //best Approach : Dutch National Flag Algorithm: O(n) sp O(1)
    /*
    intution::
    0----low-1 :: all zeros
    low----mid-1 :: all ones
    mid----high :: random
    high+1-----n-1:: all twos
     */
    private void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortArray(int[]arr,int size)
    {
        int low=0,high=size-1,mid=0;
        while(mid!=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                mid++;low++;
            }
            else if(arr[mid]==1)mid++;
            else
            {
                swap(arr,mid,high);high--;
            }
        }
    }
    public static void main(String[] args) {
      int[]arr={1,2,1,1,1,0,0,0,0,2};
      new SortArrayOfZerosOnesAndTwos().sortArray(arr,10);
        System.out.println(Arrays.toString(arr));
    }
}
