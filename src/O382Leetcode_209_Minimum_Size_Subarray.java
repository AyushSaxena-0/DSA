public class O382Leetcode_209_Minimum_Size_Subarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        //This is Sliding window
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                //reduce window by left++ and substraction
                sum-=nums[left];
                minLength=Math.min(minLength,right-left+1);
                left++;
            }
            //Increase the window size
            //Increase right pointer
            right++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{1,1,1,1,2,1,1};
        System.out.println(minSubArrayLen(2,arr));
    }
}
