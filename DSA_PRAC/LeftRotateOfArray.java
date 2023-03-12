package DSA_PRAC;
public class LeftRotateOfArray {
    /*first Approach O(n^2) brute force Approach::
    public void rotateLeft(int []arr,int times)
    {
         times=times%arr.length;
        while(times--!=0) {
            int val = arr[0];//copy the val of arr[0] to some var.
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];//shift the elements to its left side::
            arr[arr.length - 1] = val;//place the val into last index
        }
    }*/
    /*second Approach:: (better approach)
    public void rotateLeft(int[]arr,int d)
    {
        int[]temp=new int[d];
        for(int i=0;i<d;i++) //                              -----> O(d)
            temp[i]=arr[i];//copy 'd' elements
        for(int i=d;i<arr.length;i++) //                     ------->0(n-d)
            arr[i-d]=arr[i];//shifting to left indexes.
        // copying the content of temp array to arr::
        for(int i=arr.length-d;i<arr.length;i++) //          ----------->0(d)
            arr[i]=temp[i-(arr.length-d)];
                                                       ------------->> 0(n+d)
    }*/
    // Optimal Solution :: reverse method used::
    private void reverse(int []arr,int start,int end)
    {
        //swapping of the array from start to end =reverse
            while (start <end) {
                //System.out.println(start+" "+end);
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        //System.out.println("**********");
    }
    public void rotateLeft(int[]arr,int d)
    {
       reverse(arr,0,d-1);//first reverse d elements
       reverse(arr,d,arr.length-1);// now reverse n-d elements starting from d index
       reverse(arr,0,arr.length-1);// reverse the whole array
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
       new LeftRotateOfArray().rotateLeft(arr,3);
       for (int i:arr)
           System.out.print(i+" ");
    }
}
