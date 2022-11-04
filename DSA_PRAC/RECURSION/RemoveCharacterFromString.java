package DSA_PRAC.RECURSION;
public class RemoveCharacterFromString {
    public String removeCharacter(String string)
    {
        return helper(string);//with the help of helper function which takes index and helper argument
    }
    /*
    Approach 1: passing argument in each function call which is newly build string

    private String helper(String s, String string,int index) {
        if(index>string.length()-1)return s;
        if(string.charAt(index)=='a')return helper(s,string,index+1);
        return helper(s+string.charAt(index),string,index+1);
    }
    /*
    2 nd Approach : Without using helper string
     */
    public String helper(String string)
    {
        if(string.isEmpty())return "";
        char ch=string.charAt(0);
        if(ch=='a')return helper(string.substring(1));//returns the further string
        return ch+helper(string.substring(1));//returns the further string with inclusion of particular character
    }
    public static void main(String[] args) {
        System.out.println("String after removal of character is : "+new RemoveCharacterFromString().removeCharacter("paras"));
    }
}
