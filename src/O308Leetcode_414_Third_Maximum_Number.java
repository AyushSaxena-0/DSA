import java.util.Arrays;

public class O308Leetcode_414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length - 1;
        int count = 1;
        while (count < 3 && index > 0) {
            if (nums[index - 1] == nums[index]) index--;
            else {
                count++;
                index--;
            }
        }
        return count < 3 ? nums[nums.length - 1] : nums[index];
    }

    /*

       public int thirdMax(int[] nums) {
    //Alter could be using three variables a,b,c and whenever you encounter
    //nums[i]>a just do
    //int temp=a;
    //a=nums[i];
    //c=b;
    //b=temp;
    //When iteration is over return c

        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

    for(int i=0;i<nums.length;i++){
        if (nums[i] == a || nums[i] == b || nums[i] == c)
                continue;
        if(nums[i]>a){
            long temp=a;
            a=nums[i];
            c=b;
            b=temp;
        }
        else if (nums[i] > b) {
            c = b;
            b = nums[i];
        }
        else if (nums[i] > c) {
            c = nums[i];
        }
    }
    //If third largest not found in array return the largest hence return a if c orignal value is same
    //We use long because Integer.Max_Value is a valid test case
    return c == Long.MIN_VALUE ? (int)a :(int) c;
    }
     */

    public static void main(String[] args) {
        int[]arr={3,2,1};
        System.out.println(thirdMax(arr));
    }
}
