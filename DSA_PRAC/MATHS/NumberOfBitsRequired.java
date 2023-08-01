package DSA_PRAC.MATHS;

public class NumberOfBitsRequired {
    /*
    Number of bits required to change a number from 'a' to 'b'::
     */
    //brute force approach
    public  static int numberOfbitsRequired(int num1,int num2)
    {
        int xorOfNum=num1^num2;
        int count=0;
        while (xorOfNum!=0)
        {
            if((xorOfNum&1)==1)count++;
            xorOfNum>>=1;
        }return count;
    }
    //Another approach :: n=n&(n-1)-->while n!=0 where n==xorOfNums
    public static void main(String[] args) {
        System.out.println(numberOfbitsRequired(5,2));
    }
}
