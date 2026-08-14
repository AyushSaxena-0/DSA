import java.util.Arrays;

public class O294Leetcode_63_Unique_Path_II {
    public static int helper(int m, int n, int row, int col, int[][] dp, int[][] obstacleGrid) {

            //if we go outside the grid
            if(row >= m || col >= n)return 0;

            //if there is an obstacle
            if(obstacleGrid[row][col] == 1)return 0;

            //if we reach the destination
            if(row == m-1 && col == n-1){
                return 1;
            }

            //if already calculated
            if(dp[row][col] != -1)return dp[row][col];

            //once move right
            int count = 0;
            count += helper(m,n,row,col+1,dp,obstacleGrid);

            //once move down
            count += helper(m,n,row+1,col,dp,obstacleGrid);

            return dp[row][col] = count;
        }

        public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            int[][] dp = new int[m+1][n+1];

            //Filling the dp array with -1
            for(int[] arr : dp){
                Arrays.fill(arr,-1);
            }

            return helper(m,n,0,0,dp,obstacleGrid);
        }

    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int answer = uniquePathsWithObstacles(obstacleGrid);

        System.out.println(answer);
    }
}

