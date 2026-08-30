public class O319Leetcode_2091_Removing_Minimum_And_Maximum_From_Array {
    public static int minimumDeletions(int[] nums) {
        int max=0;
        int min=0;
        //Finding the max and min index
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max])max=i;
            if(nums[i]<nums[min])min=i;
        }
        int left=Math.min(min,max);
        int right=Math.max(min,max);
        //Both from left
        int fromLeft=right+1;
        //Both from right
        int fromRight=nums.length-left;
        //One from left and one from right
        int oneLeftAnotherRight=left+1+nums.length-right;
        return Math.min(Math.min(fromLeft,fromRight),oneLeftAnotherRight);
    }

    public static void main(String[] args) {
        System.out.println(minimumDeletions(new int[]{3,2,1,5,6,4}));
    }
}
