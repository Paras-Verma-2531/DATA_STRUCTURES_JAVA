package DSA_PRAC.RECURSION;
import java.util.ArrayList;
public class PowerSet {
    /*
    Recursive approach used to find power set of a string
    if i==length
    [print curr]
    we have 2 choices i,e either to include character or not
    therefore,two recursive calls
     powerSet(st,i+1,curr+st.charAt(i));
      powerSet(st,i+1,curr);
     */
//    public void powerSet(String st,int i,String curr)
//    {
//        if(i==st.length())
//        {
//            System.out.println(curr);
//            return;
//        }
//        powerSet(st,i+1,curr+st.charAt(i));
//        powerSet(st,i+1,curr);
//    }
    //using LinkedList::
    public ArrayList<String> powerSet(String st,int i,String curr)
    {
        if(i==st.length())
        {
            ArrayList<String>list=new ArrayList <>();
            list.add(curr);
            return list;
        }
        ArrayList<String> left=powerSet(st,i+1,curr+st.charAt(i));
        ArrayList<String>right=powerSet(st,i+1,curr);
        left.addAll((right));
        return left;
    }
    public static void main(String[] args) {
       ArrayList<String>list=new ArrayList <>();
        list=new PowerSet().powerSet("abc",0," ");
        System.out.println(list);
    }
}
