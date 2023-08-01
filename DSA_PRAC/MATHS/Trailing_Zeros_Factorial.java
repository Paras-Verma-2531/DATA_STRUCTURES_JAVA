package DSA_PRAC.MATHS;

public class Trailing_Zeros_Factorial {
    public int findTrailingZeros(int num)
    {
        int res=0;
        for(int i=5;i<=num;i=i*5)
        {
            res=res+num/i;
        }
        return res;
    }

    public static void main(String[] args) {
        // since every number whose factorial ends with 0s contains 2 and 5 where 5 are less  than 2. Therefore, used the above logic.
        // no need to calculate fact. since they will go beyond the range of long and int.
        System.out.println(new Trailing_Zeros_Factorial().findTrailingZeros(5));
    }
}
