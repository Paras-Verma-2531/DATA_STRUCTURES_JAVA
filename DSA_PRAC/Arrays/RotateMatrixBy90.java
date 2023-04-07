package DSA_PRAC.Arrays;
import java.util.Arrays;
import static DSA_PRAC.Arrays.reverseOfArray.reverse;
public class RotateMatrixBy90 {
    //brute force approach :: using extra matrix(ans matrix) O(n^2)
    public int[][] rotatematrix(int[][]matrix,int rows,int cols)
    {
        int[][]secondMatrix=new int[rows][cols];
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                secondMatrix[col][matrix.length-1-row]=matrix[row][col];
            }
        }return secondMatrix;
    }
    /*
    optimal approach::
    steps::
    1) transpose the matrix
    2) reverse each row
     */
    public void rotateMatrix(int[][]matrix,int rows,int cols)
    {
      // find the transpose of matrix::
        // diagonal remains same and a[i][j] becomes a[j][i];
        for(int row=0;row<rows-1;row++)
        {
            for(int col=row+1;col<cols;col++)
                swap(matrix,row,col);
        }
        //reverse the transposed matrix::
         for(int row=0;row<rows;row++)
             reverse(matrix[row],0,rows-1);
    }
    private void swap(int[][]matrix,int i,int j)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        //for(int[]mat:new RotateMatrixBy90().rotatematrix(matrix,3,3))
        new RotateMatrixBy90().rotateMatrix(matrix,3,3);
        for(int[]mat:matrix)
            System.out.println(Arrays.toString(mat));
    }
}
