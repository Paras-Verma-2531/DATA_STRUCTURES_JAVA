package DSA_PRAC.Arrays;
public class FindNthSqrtOfM {
    public int NthRoot(int n, int m)
    {
        int start=1,end=m;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int ans=(int)Math.pow(mid,n);
            if(ans==m)return mid;
            else if(ans>m)end=mid-1;
            else start=mid+1;
        }return -1;
    }
}
