package DSA_PRAC.PATTERN;
public class Pattern_1 {
    public static void main(String[] args) {
        /*
        pattern1(4);
        System.out.println("\tPattern 2");
        patter2(5);
        System.out.println("\tPattern 3");
        pattern3(5);
         */
        pattern17(4);
    }
    /*
     *
     **
     ***
     ****
     */
    static void pattern1(int n) {// outer loop will run the no of times=no of rows
        for (int i = 1; i <= n; i++) {//inner loop will be based on observation i,e in this column size is equal to row no.
            for (int j = 1; j <= i; j++)
                System.out.print("*");//when one ros is printed, we need to add new Line therefore add "New Line"
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
    static void patter2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print("*");
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
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) System.out.print("*");
            System.out.println();
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
    */
    static void pattern5(int n) {
        for(int row=1;row<=2*n-1;row++)// total no of rows=2*n-1 if starting from 1: if 0: then 2*n
        {
            int totalColsInRow=row>n?2*n-row:row;// since for the first part the "*" in colm increases which is equal to row,when row>n
            // then it is 2*n-row
            for(int col=1;col<=totalColsInRow;col++) System.out.print("* ");
            System.out.println();
        }
    }
    /*
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
  3 2 1 2 3
    2 1 2
      1
*/
    static void pattern17(int n)
    {
        for(int row=1;row<=2*n-1;row++)
        {
            int spacesInRow=row>n?row-n:n-row;
            int colsInRow=row>n?2*n-row:row;
            for(int space=1;space<=spacesInRow;space++) System.out.print("  ");
            for(int col=colsInRow;col>=1;col--) System.out.print(col+" ");
            for (int col=2;col<=colsInRow;col++) System.out.print(col+" ");
            System.out.println();
        }
    }
    /*
     *
    *  *
   *  *  *
  *  *  *  *
 *  *  *  *  *
  *  *  *  *
    *  *  *
     *   *
       *
*/
    static void pattern28(int n)
    {
        for(int row=1;row<=2*n-1;row++)
        {
            int totalColsInRow=row>n?2*n-row:row;//same as pattern 5
            int totalSpaceInRow=row>n?row-n:n-row;// now since very row has some spaces as well
            //therefore, no of spaces:: row>n?row-n:n-row
            for(int i=1;i<=totalSpaceInRow;i++) System.out.print(" ");//print spaces
            for(int col=1;col<=totalColsInRow;col++)System.out.print("* ");//print ("* )
            System.out.println();// after completion of row :: move to next Line
        }
    }
    /*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
    static void pattern30(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int spacesInRow=n-row;
            for(int i=1;i<=spacesInRow;i++) System.out.print("  ");//print spaces for n-row times
            for(int col=row;col>=1;col--) System.out.print(col+" ");// reverse printing
            for(int col=2;col<=row;col++) System.out.print(col+" ");//forward from 2---row
            System.out.println();
        }
    }
}


