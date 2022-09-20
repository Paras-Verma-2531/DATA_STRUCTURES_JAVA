package DSA_PRAC.RECURSION;

public class Palindrome_String {
    public boolean isPalindrome(String s,int left,int right)
    {
        if(left>=right)// if only one character is present
            return true;
        if(s.charAt(left)!=s.charAt(right))// if character does not match
            return false;
        return isPalindrome(s,left+1,right-1);// recursive call
    }
    public static void main(String[] args) {
        String name="naman";
        System.out.println(new Palindrome_String().isPalindrome(name,0,name.length()-1));
    }
}
