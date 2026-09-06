import java.util.ArrayList;
import java.util.List;

public class O351Leetcode_1431_Kids_With_The_Greatest_Number_Of_Candies {
    public static int max(int []nums){
        int ans=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>ans)ans=i;
        }
        return ans;
    }
    public static List<Boolean> kidsWithCandies(int[] nums, int x) {
        int m=max(nums);
        List<Boolean>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]+x>=m)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 3};
        int x = 3;

        System.out.println(kidsWithCandies(nums, x));
    }
}
