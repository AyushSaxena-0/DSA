public class O397Prefix_Sum_Leetcode_724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        //This is a prefix and suffix sum question
        int[]prefix=new int[nums.length];
        int[]suffix=new int[nums.length];
        prefix[0]=nums[0];
        //Calculate prefix
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        //Calculate suffix
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        //Now calculate when both are equal
        for(int i=0;i<nums.length;i++){
            if(suffix[i]==prefix[i])return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(pivotIndex(nums));
    }
}
