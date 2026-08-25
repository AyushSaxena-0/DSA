import java.util.Arrays;

public class O313Leetcode_494_Target_Sum {
    public static int helper(int[]nums,int target,int index,int[][]dp){
        if(index==0){
            if(nums[0]==0&&target==0)return 2;
            if(nums[0]==target||nums[0]==-target)return 1;
            return 0;
        }
        //We use 3000 as an offset as value of target can go -1000 to 1000 so negative index won't be allowed hence we add an offset to fix it according to ranges in question
        if(dp[index][target+3000]!=2000)return dp[index][target+3000];
        //Add or Substract
        //Add
        int waysAdd=helper(nums,target-nums[index],index-1,dp);
        //Substract
        int waysSubstract=helper(nums,target+nums[index],index-1,dp);
        //Total ways

        return dp[index][target+3000]=waysAdd+waysSubstract;
    }
    public static int findTargetSumWays(int[] nums, int target) {
        //Value of index is always greater than equal to 0 so no offset required
        //Value of target could become -1000 so we would need an offset thus we would increase by more than twice the offset 3000 (range could be 2000 to 4000 after adding 3000 to -1000 and 1000)
        int[][]dp=new int[nums.length+1][target+10000];
        for(int[] arr:dp){
            Arrays.fill(arr,2000);
        }
        return helper(nums,target,nums.length-1,dp);
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,2,3,4,5}, 3));
    }
}
