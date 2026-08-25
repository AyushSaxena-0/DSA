import java.util.Arrays;

public class O314Leetcode_1049_Last_Stone_Weight_II {
    public static int helper(int[]stones,int target,int index,int[][]dp){
        //Base case
        if(index<0||target==0)return 0;

        if(stones[index]>target)return helper(stones,target,index-1,dp);

        if(dp[index][target]!=-1)return dp[index][target];
        //Now go for pick
        int pick=stones[index]+helper(stones,target-stones[index],index-1,dp);
        //Now go for skip
        int skip=helper(stones,target,index-1,dp);

        return dp[index][target]=Math.max(pick,skip);
    }
    public static int lastStoneWeightII(int[] stones) {
        //sum(Group A) + sum(Group B) = totalSum
        //|sum(Group A) - sum(Group B)|
        //sum(Group B) = totalSum - x
        //|totalSum - 2x|
        //I dont know why this works but i am remebering this probbably due to totalSum>=0 for x<=sum/2;
        int sum=0;
        for(int num:stones){
            sum+=num;
        }
        int target=sum/2;
        int[][]dp=new int[stones.length+1][target+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        int x=helper(stones,target,stones.length-1,dp);
        return (sum-2*x);
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeightII(new int[]{1,2,3,4,5}));
    }
}
