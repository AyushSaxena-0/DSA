import java.util.Arrays;

public class O375Leetcode_80_Remove_Duplicates_From_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k++]=nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1,2,2,2,2,3,3,5,5,7,7,7,7,7};
        System.out.println(removeDuplicates(nums));
    }
}
