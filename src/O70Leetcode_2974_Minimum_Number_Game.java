import java.util.Arrays;

public class O70Leetcode_2974_Minimum_Number_Game {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        //Here We have created other
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length-1;i=i+2){
            //Alternative Use temp variable in same array to swap nums[i+1] and nums[i] till int i<nums.length-1;
            arr[i+1]=nums[i];
            arr[i]=nums[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr={87,23,54,222,7,87,34};
        System.out.println(Arrays.toString(numberGame(arr)));
    }
}
