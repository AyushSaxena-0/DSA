public class O332Leetcode_3903_Smallest_Stable_Index {
    public static int max(int[] nums,int index){
        //Max element in array from 0 till index
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=index;i++){
            if(max<nums[i])max=nums[i];
        }
        return max;
    }
    public static int min(int[]nums,int index){
        //Min element in array from i till nums.length-1
        int min=Integer.MAX_VALUE;
        for(int i=index;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
        }
        return min;
    }
    public static int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            //Doing as per the question
            int left=max(nums,i);
            int right=min(nums,i);
            if(left-right<=k)return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[]nums={5,0,1,4};
        int k=2;
        System.out.println(firstStableIndex(nums,k));
    }
}
