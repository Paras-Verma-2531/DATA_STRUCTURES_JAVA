package DSA_PRAC;
public class isHappy_Google_question {
    /*
    Ques:https://leetcode.com/problems/happy-number/
     */
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=numSquare(slow);
            fast=numSquare(numSquare(fast));//use the cycle detection algo
        }while(slow!=fast);
        return (slow==1);//if no!=1 means they were stuck in cycle
    }
    private int numSquare(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }return ans;
    }
}
