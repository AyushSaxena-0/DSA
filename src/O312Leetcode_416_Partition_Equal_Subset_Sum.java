public class O312Leetcode_416_Partition_Equal_Subset_Sum {
    public static boolean possible(int[]nums){
        //Array can only be divided into two parts having equal sum only when the sum is divisible by 2
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)return false;
        //You need to use the 2D DP
        int[][] dp = new int[nums.length][sum/2 + 1];
        return possibleOrNot(nums,sum/2,nums.length-1,dp);
    }
    public static boolean possibleOrNot(int[]nums,int target,int index,int[][] dp){
        //Base case of knapsack problem
        if(target==0)return true;
        //If the exact target was not found then the target would become negative or index would go below zero in future reccursive calls
        if(index<0||target<0)return false;
        //Else pick or skip
        if(dp[index][target]==1)return true;//As i cannot use boolean 2D grid as by default value is false which maynot be correct when checking the dp array wrt index and target
        else if (dp[index][target]==3)return false;
        boolean pick=possibleOrNot(nums,target-nums[index],index-1,dp);
        boolean skip=possibleOrNot(nums,target,index-1,dp);
        boolean answer=pick||skip;
        //Store your result in Dp array to use again
        if (answer) {
            dp[index][target] = 1;
        } else {
            dp[index][target] = 3;
        }
        return answer;
    }
    public static boolean canPartition(int[] nums) {
        return possible(nums);
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1,2,3,4}));
    }
}
