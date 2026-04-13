package Dynamic_Programming;

public class DP_5_Leetcode_213_House_Robber_2 {
    public static int house(int[]nums,int start,int end){
        int len=end-start+1;
        if(len==1)return nums[start];
        if(len==2)return Math.max(nums[start],nums[start+1]);
        int[]dp=new int[len];
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(nums[start+i]+dp[i-2],dp[i-1]);
        }
        //Returning the dp array last index
        return dp[len-1];
    }
    public static int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        //Since my parameters are n-1 and n-2 so if length becomes 1 index out of boun error
        //So we are using the above case for stopping
        int n=nums.length;
        //In this case we can take first and exclude last
        //Or we can take last and exclude first
        //Taking both case and taking max of either
        int case1=house(nums,0,n-2);
        int case2=house(nums,1,n-1);
        return Math.max(case1,case2);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        System.out.println(rob(nums));
    }
}
