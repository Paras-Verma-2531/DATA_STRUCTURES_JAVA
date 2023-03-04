package DSA_PRAC.Arrays;
public class LargestElement {
    // optimal solution:: O(n)
    // Assume a largest ele. and compare it with each.
    public int findLargest(int[]arr)
    {
        int largest=-10011;
        for(int i:arr)
            largest=Math.max(largest,i);
        return largest;
    }
    public int findSecondLargest(int[]arr)
    {
        int firstLargest=findLargest(arr);
        int secondLargest=-111;
        for(int i: arr)
        {
            // check if current ele is largest but !=firstLargest::
            if(i>secondLargest&&i!=firstLargest)secondLargest=i;
        }return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println(new LargestElement().findLargest(new int[]{1,2,3,4,5,6,7,8,9,111,121,222}));
        System.out.println(new LargestElement().findSecondLargest(new int[]{1,2,3,4,5,6,7,8,9,111,121,222}));
    }
}
