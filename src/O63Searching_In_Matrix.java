import java.util.Arrays;

public class O63Searching_In_Matrix {
//Time complexity is N*M
    public static int[] searchMatrix(int[][] matrix, int target) {
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(matrix[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
    return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,23,45,6,543,12},
                {99,96,86,3467,8765,4000},
                {92,91}
        }   ;
        int target=96;
        System.out.println(Arrays.toString(searchMatrix(matrix,target)));


    }
}
