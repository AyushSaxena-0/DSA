public class O176Leetcode_3512_Minimum_Operation_To_Make_Sum_Divisible_By_K {
    public static int sumofarr(int[]nums){
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        return sum;
    }
    public static int minOperations(int[] nums, int k) {
        int sum=sumofarr(nums);
        if(sum%k==0)return 0;
        return (sum%k);
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,3,4},4));
    }
}
