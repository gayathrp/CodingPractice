/**
 * Created by Gayathri on 11/20/16.
 */
public class MatrixRotation {
    public static void main(String args[]) {
        int[][] matrix = new int[3][3];
        for (int row = 0; row < 3; row ++)
            for (int col = 0; col < 3; col++)
                matrix[row][col] = 1 + row * 3 + col;
        int [][] left = rotateLeft(matrix);
        for(int i = 0 ; i < left.length ; i++)
            for(int j = 0 ; j < left.length ; j++)
                System.out.println(left[i][j]);
        int [][] right = rotateRight(matrix);
        for(int i = 0 ; i < right.length ; i++)
            for(int j = 0 ; j < right.length ; j++)
                System.out.println(right[i][j]);

    }
    private static int [][] rotateLeft(int mat [][]) {
       // if(mat.length == 0) return 0;
        int n = mat.length;
        int [][] result = new int[n][n];
        for(int i = 0 ; i < n ; i++)
            for(int j = n-1 ; j >= 0 ; j--)
                result[n-j-1][i] = mat[i][j];
        return result;
    }
    private static int [][] rotateRight(int [][] mat) {
       // if(mat.length == 0) return 0;
        int n = mat.length;
        int [][] result = new int[n][n];
        for(int i = 0 ; i < n ; i++)
            for(int j = n-1 ; j >= 0 ; j--)
                result[i][n-j-1] = mat[j][i];
        return result;
    }

}
