package DSA_PRAC.Arrays;

import java.util.Arrays;

public class FlipImage {
    public int[][]flipImage(int[][]array)
    {
        for(int i=0;i<array.length;i++)
        {
            int j=array[i].length-1,k=0;
            while(k<j)
            {
                int temp=array[i][k];
                array[i][k]=array[i][j];
                array[i][j]=temp;
                k++;j--;
            }
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(array[i][j]==0)
                    array[i][j]=1;
                else
                    array[i][j]=0;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        // given n*n array which only contains 0 and 1:
        // first reverse each row and then invert 0 by 1 and vice-versa;
        int[][]array=new FlipImage().flipImage(new int [][]{{1,1,0},{1,0,1},{0,0,0}});
        System.out.println(Arrays.deepToString(array));

    }
}


