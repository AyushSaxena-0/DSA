import java.util.Arrays;

public class O320Leetcode_867_Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        //Note m*n matrix means m and n may not be equal
        //create a transposed matrix with n*m dimention and copy elements at correct position
        //Note rows =matrix number of columns
        int rows=matrix[0].length;
        //Note cols =matrix rows
        int cols=matrix.length;
        int[][]ans=new int[rows][cols];
        //Take care of the boundries row of ans should be equal in length to col
        //And vice versa for col of ans with row of matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][]ans=transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
