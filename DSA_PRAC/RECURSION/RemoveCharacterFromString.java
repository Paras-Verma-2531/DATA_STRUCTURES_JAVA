package DSA_PRAC.RECURSION;
public class RemoveCharacterFromString {
    public String removeCharacter(String string)
    {
        return helper("",string,0);//with the help of helper function which takes index and helper argument
    }
    /*
    Approach 1: passing argument in each function call which is newly build string
     */
    private String helper(String s, String string,int index) {
        if(index>string.length()-1)return s;
        if(string.charAt(index)=='a')return helper(s,string,index+1);
        return helper(s+string.charAt(index),string,index+1);
    }
    public static void main(String[] args) {
        System.out.println("String after removal of character is : "+new RemoveCharacterFromString().removeCharacter("paras"));
    }
}
