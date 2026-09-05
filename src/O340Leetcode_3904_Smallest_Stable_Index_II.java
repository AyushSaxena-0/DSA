public class O340Leetcode_3904_Smallest_Stable_Index_II {
    public static int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[]prefix=new int[n];
        prefix[0]=nums[0];
        //This could be called DP as i ams toring max and min values till each index to optimize
        //By brute force i was getting TLE
        //So this would work
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        int[]suffix=new int[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.min(suffix[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(prefix[i]-suffix[i]<=k)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(firstStableIndex(nums,4));
    }
}
