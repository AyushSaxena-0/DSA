import java.util.Arrays;

public class O293Leetcode_1155_Number_Of_Dice_Rolls_With_Target_Sum {
    public static int helper(int n,int k,int target,int[][]dp){
        if(n==0)return target==0?1:0;
        if(target<0)return 0;
        if(dp[n][target]!=-1)return dp[n][target];
        int count=0;
        int mod=1_000_000_007;
        for(int i=1;i<=k;i++){
            count+=helper(n-1,k,target-i,dp);
            count=count%mod;
        }
        return dp[n][target]=count;
    }
    public static int numRollsToTarget(int n, int k, int target) {
        //I tried it multiple times by normal recursion but TLE comes
        //So i am using dp now
        int[][]dp=new int[n+1][target+1]; //obvious reasons i did target+1 and n+1
        //Filling entire array by -1
        for(int[]arr:dp){
            Arrays.fill(arr,-1); //It works on array
        }
        return helper(n,k,target,dp);
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2, 6, 3));
    }
}
