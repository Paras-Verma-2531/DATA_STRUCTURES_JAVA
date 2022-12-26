package DSA_PRAC.RECURSION;
public class Pattern_Reccursion {
    //method 1::
    /*
    public static void patternRec(int n)
    {
        if(n==0)return;
        for (int i=1;i<=n;i++) System.out.print("* ");
        System.out.println();
        patternRec(n-1);//here outer loop is being represented by recursion call
    } */
    public static void patternRec(int row,int col)
    {
        if(row==0)return;
        if(col<row)
        {
            System.out.print("* ");
            patternRec(row,col+1);
        }else {
            System.out.println();
            patternRec(row-1,0);
        }
    }
    public static void main(String[] args) {
        patternRec(5,0);
    }
}
