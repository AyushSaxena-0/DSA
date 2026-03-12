public class O122Find_Non_coupled_Integer_Neg_Pos_Array {
    //This array consist of all the numbers 1,-1,2,-2,-3,3 only one number that is not having its negative find that number
    static int nonCoupled(int[]nums){
        int sum=0;
        //Taking sum so all the negative and positive will cancel
        //Leaving the non coupled
        //Reduced the time complexity from O(N^2) To O(N)
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={-1,1,-2,2,3};
        System.out.println(nonCoupled(nums));
    }
}
