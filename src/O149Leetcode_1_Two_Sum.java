import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O149Leetcode_1_Two_Sum {
    //Brute Force Approach
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static int[]optimisedTwoSum(int[]nums,int target){
        //Note this method
        //We are doing this in one iteration
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment))return new int[]{map.get(compliment),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(optimisedTwoSum(nums,target)));
    }
}
