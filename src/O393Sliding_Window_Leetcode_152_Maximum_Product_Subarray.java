public class O393Sliding_Window_Leetcode_152_Maximum_Product_Subarray {
    public static int maxProduct(int[] nums) {

        int ans=nums[0];
        int min=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            //Note since we need both the max and min in current_min,current_max so we do not update min and max directly as our other case would be effected
            int current_min=Math.min(nums[i],Math.min(min*nums[i],max*nums[i]));
            int current_max=Math.max(nums[i],Math.max(min*nums[i],max*nums[i]));

            min=current_min;
            max=current_max;

            ans=Math.max(ans,max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,-100,-99};
        System.out.println(maxProduct(nums));
    }
}
