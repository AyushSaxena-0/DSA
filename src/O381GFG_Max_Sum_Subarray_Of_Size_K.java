public class O381GFG_Max_Sum_Subarray_Of_Size_K {
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        //Subarray->Sliding window pattern
        //Calculating the first subarray of size k
        //Subarray means continuous
        //It won't work on subset
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>maxSum)maxSum=sum;
        for(int i=0;k+i<arr.length;i++){
            sum=sum-arr[i];
            sum=sum+arr[k+i];
            if(sum>maxSum)maxSum=sum;
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[]nums=new int[]{5,6,4,1,2};
        System.out.println(maxSubarraySum(nums,2));
    }
}
