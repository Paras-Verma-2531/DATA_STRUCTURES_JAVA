package DSA_PRAC.RECURSION;
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
    public static void main(String[] args) {
        new SubSequence().subSeq("abc");
    }
}
