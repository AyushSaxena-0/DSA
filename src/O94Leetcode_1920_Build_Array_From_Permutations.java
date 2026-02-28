import java.util.Arrays;

public class O94Leetcode_1920_Build_Array_From_Permutations {
    public static int[] buildArray(int[] nums) {
        //Lol this is the easiest problem on leetcode
        //This does not deserve to be on leetcode
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
