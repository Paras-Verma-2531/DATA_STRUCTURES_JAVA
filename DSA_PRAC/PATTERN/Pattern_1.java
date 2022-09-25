package DSA_PRAC.PATTERN;
public class Pattern_1 {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println("\tPattern 2");
        patter2(5);
        System.out.println("\tPattern 3");
        pattern3(5);
    }
    /*
*
**
***
****
*/
    static void pattern1(int n)
    {// outer loop will run the no of times=no of rows
        for(int i=1;i<=n;i++)
        {//inner loop will be based on observation i,e in this column size is equal to row no.
            for(int j=1;j<=i;j++) System.out.print("*");//when one ros is printed, we need to add new Line therefore add "New Line"
            System.out.println();
        }
    }
    /*
    *****
    *****
    *****
    *****
    *****
     */
    static void patter2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) System.out.print("*");
            System.out.println();
        }
    }
    /*
    *****
    ****
    ***
    **
    *
     */
    static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++) System.out.print("*");
            System.out.println();
        }
    }
}
