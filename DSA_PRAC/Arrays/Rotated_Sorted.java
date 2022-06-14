package DSA_PRAC.Arrays;
public class Rotated_Sorted {
    /*
    Sorted & Rotated array refers to the array in which half of the element are sorted and half of them are rotated
    eg: 90 100 40 50 60 70 80
     */
    public int searchInRotSorted(int[] array,int element)
    {
        int start=0;
        int high=array.length-1;
        while(start<=high)
        {
            int mid=(start+high)/2;
            if(array[mid]==element)return mid;
            if(array[start]<array[mid])// left portion of array is sorted
            {
                if(element>=array[start]&& element<array[mid])
                {
                    high=mid-1;
                }else
                {
                    start=mid+1;
                }
            }
            else
            {// right part is sorted
                if(element>array[mid]&& element<=array[high])
                {
                    start=mid+1;
                }else
                {
                    high=mid-1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] array={90,100,10,20,30,40,50,60,70};
        int res=new Rotated_Sorted().searchInRotSorted(array,10);
        System.out.println(res!=-1?"the element is present at  position "+(res+1):"element not present");
    }
}
