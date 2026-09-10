import java.util.Arrays;

public class O375Leetcode_80_Remove_Duplicates_From_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {
        //Really love this approach
        //The i pointer moves in array from start to end
        //But k moves with almost two command
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k<2||nums[i]!=nums[k-2]){
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
