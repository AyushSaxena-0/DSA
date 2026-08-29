public class O318Leetcode_643_Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        //This is sliding window approach
        //Calculate first window then add and substract the last and first elements respectively to move window ahead
        double sum=0;
        //Calculating the first window according to window size given
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxSum=sum;
        //Move the window ahead
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];//Remove the first element from the window
            sum+=nums[i];//Add the last element in the sliding window
            //Now calculate maxsum according to condition
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum/k;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int k=2;
        System.out.println(findMaxAverage(nums,k));
    }
}
