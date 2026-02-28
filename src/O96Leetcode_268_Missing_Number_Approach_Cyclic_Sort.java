public class O96Leetcode_268_Missing_Number_Approach_Cyclic_Sort {
    //This is not an optimised approach
    //Sum approach was better
    //for [0,N] index=arr[index]
    //If given [1,N] use index=arr[index]-1
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void cyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
    }
    public static int missingNumber(int[] nums) {
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(missingNumber(arr));
    }
}
