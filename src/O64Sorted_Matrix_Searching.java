import java.util.Arrays;

public class O64Sorted_Matrix_Searching {
    public static int[] searchMatrix(int[][]matrix,int target){
        int row=matrix.length-1;
        int col=0;

//Starting from the top right corner and checking
        while (row >= 0 && col < matrix[0].length) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            else if (matrix[row][col] < target) {
                col++;
            }
            else {
                row--;
            }
        }
//If nothing is found we return -1 for both index
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][]matrix={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=37;
        System.out.println(Arrays.toString(searchMatrix(matrix,target)));
    }
}
