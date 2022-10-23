package DSA_PRAC.RECURSION;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }
    public static int sumOfDigits(int n)
    {
        if(n==0)return 0;
        return n%10+sumOfDigits(n/10);
        /*since sum of digits [1342]=1+3+4+2
        which can be achieved by n%109giving the last no)thus adding it to the n/10[extracting the last no.]
        repeating the process till n!=0
         */
    }
}
