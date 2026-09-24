public class O405Leetcode_3550_Smallest_Index_With_Digit_Sum_Equal_To_Index {
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            sum=sum+d;
            num=num/10;
        }
        return sum;
    }
    public static int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digitSum(nums[i]))return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,3,2};
        System.out.println(smallestIndex(nums));
    }
}
