package DSA_PRAC;
import java.util.Arrays;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] arr=new SieveOfEratosthenes().isPrime(12);
        for(int i=1;i<arr.length;i++)
            System.out.println(arr[i]?+i +" is prime":+i +" is not prime");
    }
    public boolean[] isPrime(int n)
    {
        boolean[] arr=new boolean[n+1];// n+1 because to neglect the effect of 0th index
        Arrays.fill(arr,true);// fill the array with value as true
        arr[0]=false;arr[1]=false;// make rr[0],arr[1] as false
        for(int i=2;i*i<=n;i++)// start the loop from 2 till n^(1/2)
        {
            for(int j=2*i;j<=n;j+=i)// make the multiple of i as false
                 arr[j]=false;
        }
        return arr;
    }
}
