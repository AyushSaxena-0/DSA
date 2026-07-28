public class O235Leetcode_70_Climbing_Stairs {
    public static int helper(int n,int[]dp){
        //Base case
        if(n==1)return 1;
        if(n==2)return 2;
        //Now using dp array to check weather it is present in dp array or not
        if(dp[n]!=0)return dp[n];
        //Else calculating and saving in dp array
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public static int climbStairs(int n) {
        //I am going to use Dynamic Programming here
        int[]dp=new int[n+1];
        return helper(n,dp);
    }

    static void main() {
        System.out.println(climbStairs(5));
    }
}
