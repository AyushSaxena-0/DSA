import java.util.Arrays;

public class O308Leetcode_414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int index=nums.length-1;
        int count=1;
        while(count<3&&index>0){
            if(nums[index-1]==nums[index])index--;
            else{
                count++;
                index--;
            }
        }
        return count<3?nums[nums.length-1]:nums[index];
    }

    public static void main(String[] args) {
        int[]arr={3,2,1};
        System.out.println(thirdMax(arr));
    }
}
