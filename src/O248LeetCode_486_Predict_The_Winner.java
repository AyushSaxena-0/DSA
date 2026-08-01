public class O248LeetCode_486_Predict_The_Winner {
    public static int helper(int[]nums,int left,int right){
        //This is the base case
        if(left==right)return nums[left];
        //We are calculating difference between player 1 gain and player 2 gain
        //As this function returns at each step the difference between scores of player 1 and player 2
        //one pick other pick another from remaining
        int leftPick=nums[left]-helper(nums,left+1,right);
        //one pick other pick another from remaining
        int rightPick=nums[right]-helper(nums,left,right-1);

        return Math.max(leftPick,rightPick);
    }
    public static boolean predictTheWinner(int[] nums) {
        int left=0;
        int right=nums.length-1;
        return helper(nums,left,right)>=0;
    }

    static void main() {
        //Since player 1 gets first chance so he can in no way win this game
        int[] nums = {1, 5, 2};
        System.out.println(predictTheWinner(nums));
    }
}
