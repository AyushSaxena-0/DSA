import java.util.Arrays;

public class O385Leetcode_4052_Cyclically_Shift_Rows_And_Columns {
    public static int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][]ans=new int[n][n];
        for(int i=0;i<n;i++){
            //Apply row shift
            //As here shifting is done according to row number
            int k=rowShift[i];
            for(int j=0;j<n;j++){
                ans[i][(j-k+n)%n]=grid[i][j];
            }
            //Apply colshift
        }
        int[][]result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //As here shifting is done according to column number
                int k=colShift[j];
                result[(i-k+n)%n][j]=ans[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 2;

        int[][] grid = {
                {1, 2},
                {3, 4}
        };

        int[] rowShift = {1, 0};
        int[] colShift = {0, 1};

        Solution sol = new Solution();

        int[][] result = cyclicShift(
                n, grid, rowShift, colShift
        );

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

    }
}
