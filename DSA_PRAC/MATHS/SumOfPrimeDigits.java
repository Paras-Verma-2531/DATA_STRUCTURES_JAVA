package DSA_PRAC.MATHS;
import java.util.Arrays;
public class SumOfPrimeDigits {
    public static int getSumOfPrimeDigits(int n)
    {
        boolean[]arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        setAllPrime(arr,n);
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            if(arr[d])sum+=d;//if the extracted digit is prime ::add it to the sum
            n/=10;
        }return  sum;
    }
    private static void setAllPrime(boolean[] arr,int n) {
        for(int i=2;i*i<=n;i++)
        {
            for(int j=2*i;j<=n;j+=i)arr[j]=false;
        }
    }
    public static void main(String[] args) {
        System.out.println(getSumOfPrimeDigits(25600));
    }
}
