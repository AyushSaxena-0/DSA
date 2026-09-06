import java.util.Arrays;

public class O354Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_The_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            //Note elements back and forward could be counted so j=i+1 won't work
            //Also skip i==j case
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]>nums[j])count++;
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
