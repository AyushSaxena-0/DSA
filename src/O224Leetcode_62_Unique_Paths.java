import java.util.Arrays;

public class O224Leetcode_62_Unique_Paths {
    public static int uniquePaths(int m, int n) {
        //I am going to solve it using Dynamic Programming
        int[][]dp=new int[m][n];
        //Filling the dp array first column by 1
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        //Filling the first row by 1
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        //Using relation dp[i][j]=dp[i-1][j]+dp[i][j-1];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        //The last cell gives the value of total ways to reach to that cell
        return dp[m-1][n-1];
    }
    public static int helper(int m,int n,int row,int col,int[][]dp){
        if(row==m-1&&col==n-1){
            return 1;
        }
        if(row>m||col>n)return 0;
        if(dp[row][col]!=-1)return dp[row][col];
        //once move right
        int count=0;
        count+=helper(m,n,row,col+1,dp);
        //once move down
        count+=helper(m,n,row+1,col,dp);
        return dp[row][col]=count;
    }
    public static int uniquePaths2(int m, int n) {
        int[][]dp=new int[m+1][n+1];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(m,n,0,0,dp);
    }

    public static void main(String[]args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths2(3, 7));
    }
}
