public class O283Leetcode_2996_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public static boolean isInArray(int[]nums,int target){
        for(int num:nums){
            if(num==target)return true;
        }
        return false;
    }
    public static int missingInteger(int[] nums) {
        //Calculating Prefix Sum
        int[] prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }
        //To handle edge case
        int index=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                index=i;
                break;
            }
        }
        //PREFIX Till INDEX this is smallest number greater than sequential prefix sum
        //This is answer we only check if this is not in array by below loop
        int preIndex=prefixSum[index];

        for(int i=preIndex;;i++){
            if(!isInArray(nums,i)){
                return i;
            }
        }
    }

    static void main() {
        int[]nums={1,2,3,4,5,9};
        System.out.println(missingInteger(nums));
    }
}
