import java.util.Arrays;

public class O225Leetcode_65_Unique_Paths_2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;

        int[][]dp=new int[rows][cols];

        for(int[] row:dp){
            Arrays.fill(row,1);
        }

        for(int i=0;i<rows;i++){
            if(obstacleGrid[i][0]==1||(i>0&&dp[i-1][0]==0)){
                dp[i][0]=0;
            }
        }
        for(int i=0;i<cols;i++){
            if(obstacleGrid[0][i]==1||(i>0&&dp[0][i-1]==0)){
                dp[0][i]=0;
            }
        }
        //Now using dp relation
        //dp[i][j]=dp[i-1][j]+dp[i][j]
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[rows-1][cols-1];
    }

    static void main() {
        int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
