public class O396Kadane_Algorithm_Leetcode_918_Maximum_Sum_Circular_Subarray {
    public static int maxSubarraySumCircular(int[] nums) {
        //Note either the max sum would be circular or min sum
        //If max sum is circular then min sum is straight
        //If min sum is circular then max sum is straight
        //Calculate max of max sum and sum of (array-min)
        int max=nums[0];
        int min=nums[0];
        int sum=nums[0];
        int bestx=nums[0];
        int bestn=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max+nums[i],nums[i]);
            bestx=Math.max(bestx,max);
            min=Math.min(min+nums[i],nums[i]);
            bestn=Math.min(bestn,min);
            sum+=nums[i];
        }//Alter you can create Two variables and notice sum-prefix[i]==prefix[i] for both prefix and suffix to be equal
        //Suffix=sum-prefix
        if(bestx<0)return bestx;//Otherwise sum would be zero which is not possible
        return Math.max(bestx,sum-bestn);
    }

    public static void main(String[] args) {
        int[]nums={5,-4,-5,-6,5};
        System.out.println(maxSubarraySumCircular(nums));
    }
}
