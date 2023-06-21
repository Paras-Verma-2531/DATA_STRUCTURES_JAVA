package DSA_PRAC.RECURSION;

import java.util.ArrayList;

public class SubSequence {
    public void subSeq(String string)
    {
        helper("",string);
    }
    private void helper(String s,String string) {
        if(string.isEmpty()) {System.out.println(s);return;}
        helper(s+string.charAt(0),string.substring(1));//include that character
        helper(s,string.substring(1));//ignore that character
    }
//    for the integer using List
    public void printSubseq(int index, ArrayList<Integer>list,int[]arr)
    {
        if(index==arr.length)
        {
            System.out.println(list.toString());
            return;
        }
        list.add(arr[index]);
        printSubseq(index+1,list,arr);
        list.remove(list.size()-1f);
        printSubseq(index+1,list,arr);
    }
    public static void main(String[] args) {
        new SubSequence().printSubseq(0,new ArrayList<Integer>(),new int[]{3,1,2});
//        new SubSequence().subSeq("abc");
    }
}
