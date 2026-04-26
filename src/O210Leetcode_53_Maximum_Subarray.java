public class O210Leetcode_53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        //Kadane Algorithm
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int num:nums){
            sum+=num;
            max=Math.max(sum,max);
            //There is no point taking sum as negative as we can always skip those elements
            if(sum<0)sum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
