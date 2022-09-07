import java.util.Arrays;
import static DSA_PRAC.Arrays.reverseOfArray.swap;
public class Heap {
    public static void main(String[] args) {
    int[] arr={0,40,10,30,50,60,15};
        System.out.println(Arrays.toString(arr));
        BuildHeap(arr,6);// function call
        System.out.println(Arrays.toString(arr));
    }
    public  static void BuildHeap(int[]arr,int size)
    {
        for(int i=size/2;i>0;i--)// start the loop from size/2 because in an array there are n/2 elements which are leaf nodes
            //thus they are already a heap ----[starting index of leaf node: [[n/2]+1-----n]
            heap(arr,size,i);
    }
    private  static void heap(int[] arr, int size, int i) {
        int largest=i,left=2*i,right=2*i+1;//store the position of left and right child for further calculations
        if(left<=size && arr[largest]<arr[left])largest=left;// left<=size so that they don't cross the length of array
        if(right<=size&& arr[largest]<arr[right])largest=right;
        if(largest!=i)// means either of children is greater than parent
        {// swap the parent with pos having  larger element
            swap(arr,largest,i);
            heap(arr,size,largest);// recursive call
        }
    }
}
