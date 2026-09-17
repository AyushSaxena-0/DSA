public class O395Kadane_Algorithm_Leetcode_1749_Maximum_Absolute_Sum_Of_Any_Sub_Array {
    public static int maxAbsoluteSum(int[] nums) {
        //I need to maintain min, max both
        //A highly negative sum or highly positive sum max of both mod value
        int min=nums[0];
        int max=nums[0];
        int best=Math.abs(nums[0]);//Because absolute value is asked

        for(int i=1;i<nums.length;i++){
            int currMin=Math.min(min+nums[i],nums[i]);
            int currMax=Math.max(max+nums[i],nums[i]);
            //Now i have to take the absolute value of the currMin
            best=Math.max(best,Math.max(Math.abs(currMin),currMax));
            //update the min to currMin
            min=currMin;
            max=currMax;
        }
        return best;
    }

    public static void main(String[] args) {
        int[]nums={-5,1};
        System.out.println(maxAbsoluteSum(nums));
    }
}
