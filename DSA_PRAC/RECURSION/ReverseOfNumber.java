package DSA_PRAC.RECURSION;
public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    static int reverse(int n)
    {
        int len=(int)Math.log10(n)+1;//provides length of the number
        return helper(n,len);
    }
    private static int helper(int n, int len) {
        if(n%10==n)return n;
        //logic is: make 10 to the power of length-1 * extracted digit and add it with for n/10;
        return (n%10)*(int)Math.pow(10,len-1)+helper(n/10,len-1);
    }
}
