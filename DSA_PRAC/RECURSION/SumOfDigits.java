package DSA_PRAC.RECURSION;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
        System.out.println(productOfDigits(555));
    }
    public static int sumOfDigits(int n)
    {
        if(n==0)return 0;
        return n%10+sumOfDigits(n/10);
        /*since sum of digits [1342]=1+3+4+2
        which can be achieved by n%10 (giving the last no)thus adding it to the n/10[extracting the last no.]
        repeating the process till n!=0
         */
    }
    public static  int productOfDigits(int n)
    {
        if(n%10==n)return n;// because it a single no exists its modulu equal to itself
        return n%10*productOfDigits(n/10);

    }
}
