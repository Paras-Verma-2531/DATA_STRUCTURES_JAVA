package DSA_PRAC.RECURSION;
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
    public void powerSet(String st,int i,String curr)
    {
        if(i==st.length())
        {
            System.out.println(curr);
            return;
        }
        powerSet(st,i+1,curr+st.charAt(i));
        powerSet(st,i+1,curr);
    }
    public static void main(String[] args) {
       new PowerSet().powerSet("abc",0," ");
    }
}
