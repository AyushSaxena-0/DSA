public class O75Leetcode_2535_Differance_Bw_Element_Sum_Digit_Sum_Array_Elements {
    public static int esum(int[]nums){
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        return sum;
    }

    public static int dsum(int[]nums){
        int sum=0;
        for(int number : nums){
            int digit=0;
            while(number>0){
                digit=number%10;
                sum=sum+digit;
                number=number/10;
            }
        }
        return sum;
    }
    public static int differenceOfSum(int[] nums) {
        int elementsum=esum(nums);
        int digitsum=dsum(nums);
        return Math.max((elementsum-digitsum),(digitsum-elementsum));
    }

    public static void main(String[] args) {
        int[] nums={12,34,65,152,765};
        System.out.println(differenceOfSum(nums));
    }
}
