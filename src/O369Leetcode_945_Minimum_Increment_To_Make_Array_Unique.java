import java.util.Arrays;

public class O369Leetcode_945_Minimum_Increment_To_Make_Array_Unique {
    public static int minIncrementForUnique(int[] nums) {
        //I have solved here according to question
        int moves=0;
        Arrays.sort(nums);
        //Bruteforce gives TLE
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                //Very clever
                int required=nums[i-1]+1;
                moves=moves+required-nums[i];
                nums[i]=required;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1,1,1,1,1};
        System.out.println(minIncrementForUnique(nums));
    }
}
