package DSA_PRAC.RECURSION;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(new LinearSearch().searchInArray(new int[]{1,2,3,4,5,6,7,8},14,0));
    }
    public boolean searchInArray(int[] array,int target,int start)
    {
        if(start==array.length)return false;//if out of bound return false --> indicates element is not present
        if(array[start]==target)return true;// if present return true;
        return searchInArray(array,target,start+1);//recursive call for i+1 index
    }
}
