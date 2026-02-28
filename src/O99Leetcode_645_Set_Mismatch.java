import java.util.Arrays;

public class O99Leetcode_645_Set_Mismatch {
    public static void swap(int[]nums,int i, int j){
        //Don't do mistake in swap last line would be nums[j]=temp
        //not nums[j]=nums[i]
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void cycleSort(int[]nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1){
                i++;
            }
            else{
                int correctIndex=nums[i]-1;
                if(nums[correctIndex]!=nums[i]){
                    swap(nums,i,correctIndex);
                }
                else{
                    i++;
                }
            }
        }
    }
    public static int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
