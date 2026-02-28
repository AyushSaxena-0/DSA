import java.util.Arrays;

public class O65Sorted_2D_Matrix_Searching {

    // Binary search in a particular row
    public static int[] bs(int[][] matrix, int target, int row, int scol, int ecol) {
        while (scol <= ecol) {
            int mid = scol + (ecol - scol) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                scol = mid + 1;
            } else {
                ecol = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // If only one row, directly apply binary search
        if (rows == 1) {
            return bs(matrix, target, 0, 0, cols - 1);
        }

        // Run the loop till two rows are remaining
        // Run from the middle element
        // I am running column wise, you can run row wise
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) { // While this is true it will have more than two rows
            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            } else if (matrix[rMid][cMid] < target) {
                rStart = rMid; // We don't do rMid+1 as element could be in the row somewhere
            } else {
                rEnd = rMid; // We don't do rMid-1 as element could be found in row
            }
        }

        // Now we have two rows
        // Check whether the target is in middle column of two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half
        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
            return bs(matrix, target, rStart, 0, cMid - 1);
        }

        // Search in 2nd half
        if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1]
                && target <= matrix[rStart][cols - 1]) {
            return bs(matrix, target, rStart, cMid + 1, cols - 1);
        }

        // Search in 3rd half
        if (cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
            // We don't need to check target >= matrix[rStart+1][0]
            // as this else comes only if upper halves are eliminated
            return bs(matrix, target, rStart + 1, 0, cMid - 1);
        }

        // Search in 4th half
        else {
            return bs(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(searchMatrix(matrix, 3)));
        System.out.println(Arrays.toString(searchMatrix(matrix, 8)));
        System.out.println(Arrays.toString(searchMatrix(matrix, 10)));
    }
}
