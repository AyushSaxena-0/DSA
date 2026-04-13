package Dynamic_Programming;

public class DP_4_Leetcode_198_House_Robber {
    public static int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        //Creating a new dp array
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        //Now using iterative dp
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{5,15,6,20,22,1};
        System.out.println(rob(nums));
    }
}
