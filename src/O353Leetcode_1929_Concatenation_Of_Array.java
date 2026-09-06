import java.util.Arrays;

public class O353Leetcode_1929_Concatenation_Of_Array {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[]ans=new int[2*n];
        int i=0;
        //Pretty straight forward question
        while(i<n){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int[] ans=getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
