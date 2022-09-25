package DSA_PRAC.PATTERN;
public class Pattern_1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n)
    {// outer loop will run the no of times=no of rows
        for(int i=1;i<=n;i++)
        {//inner loop will be based on observation i,e in this column size is equal to row no.
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }
}
