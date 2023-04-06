package DSA_PRAC.Arrays;
import java.util.Arrays;
public class SetMatrixToZeros {
    /*
    public void setMatrixToZeros(int[][]matrix,int m,int n)
    {
        //brute force approach::
        for(int row=0;row<m;row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0) {
                    markRow(matrix, row);
                    markCol(matrix, col);
                }
            }
        }
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(matrix[row][col] ==-1) matrix[row][col]=0;
            }
        }
    }
    private void markCol(int[][] matrix,int col) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][col]!=0)matrix[i][col]=-1;
        }
    }
    private void markRow(int[][] matrix,int row) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[row][i]!=0)matrix[row][i]=-1;
        }
    }
    */
    //better approach ::
    public void setMatrixToZeros(int[][]matrix,int m,int n) {
        int []rowMatrix=new int[m];
        int[]colMatrix=new int[n];
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(matrix[row][col]==0)
                {
                    rowMatrix[row]=1;
                    colMatrix[col]=1;
                }
            }
        }
        //reiterate the matrix and set i,j as 0 if either that row or column in other matrices are set to 1:
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(rowMatrix[row]==1||colMatrix[col]==1)
                   matrix[row][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][]matrix={{1,0,1},{0,0,1},{0,1,1}};
        new SetMatrixToZeros().setMatrixToZeros(matrix,3,3);
        for(int[]mat:matrix)
         System.out.println(Arrays.toString(mat));
    }
}
