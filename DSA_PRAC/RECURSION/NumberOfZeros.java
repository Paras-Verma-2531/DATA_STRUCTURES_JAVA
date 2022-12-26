package DSA_PRAC.RECURSION;
public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countNumberOfZeros(302));
    }
//    static int countNumberOfZeros(int n)
//    {
//        return count(n,0);//count is an helper function which actually returns the result
//    }
//    private static int count(int n, int i) {
//        if(n==0)return i;// no itself is zero
//        return n%10==0?count(n/10,i+1):count(n/10,i);
//    }
      static int countNumberOfZeros(int n)
    {
        if(n==0)return 0;
        if(n%10==0)return 1+ countNumberOfZeros(n/10);
        return countNumberOfZeros(n/10);
    }
}
