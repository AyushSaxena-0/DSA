package Dynamic_Programming;

import java.util.Arrays;

public class DP_2_Leetcode_746_Minimum_Cost_Climbing_Stairs {
    public static int recMinCost(int[]cost, int index){
        //This is a recursive solution
        if(index<=1)return cost[index];
        return cost[index]+Math.min(recMinCost(cost,index-1), recMinCost(cost,index-2));
    }
    public static int recSol(int[] cost) {
        //Top floor is beyond the last stair
        //We need to be above last stair
        //This is simple recursive solution
        int n=cost.length;
        return Math.min(recMinCost(cost,n-1), recMinCost(cost,n-2));
    }
    public static int dpSol(int[]cost, int index, int[]dp){
        if(index<=1)return cost[index];
        //We filled array with -1 as default
        if(dp[index]!=-1)return dp[index];
        //Saving and returning at the same time
        return dp[index]=cost[index]+Math.min(dpSol(cost,index-1,dp), dpSol(cost,index-2,dp));
    }
    public static int recursiveDp(int[] cost) {
        //Top floor is beyond the last stair
        //We need to be above last stair
        int n=cost.length;
        int[]dp=new int[n];
        //What if cost is zero so we cannot use 0 as default look at range of cost
        Arrays.fill(dp,-1);
        return Math.min(dpSol(cost,n-1,dp), dpSol(cost,n-2,dp));
    }
    public static int iterativeDp(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        //Using iterative dp
        for(int i=2;i<dp.length;i++){
            //Alter you don't need an array you just need last two numbers
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        //This is bottom up dp
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args) {
        int[]cost={1,2,3,4,5};
        System.out.println(recSol(cost));
        System.out.println(recursiveDp(cost));
        System.out.println(iterativeDp(cost));
    }
}
