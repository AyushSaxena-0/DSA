import java.util.Arrays;

public class O234Leetcode_1464_Maximum_Product_Of_Two_Elements_In_Array {
    public static int maxProduct(int[] nums) {
        //Sorting elements firstly and then using the last two numbers
        //in sorted array for required product
        Arrays.sort(nums);
        int n=nums.length-1;
        return (nums[n]-1)*(nums[n-1]-1);
    }
    static void main() {
        System.out.println(maxProduct(new int[]{85,34,99,421}));
    }
}
