public class O91Leetcode_136_Single_number {
    public static int singleNumber(int[] nums) {
        int ans=0;
        //Properties
        //a^a=0
        //a^0=a
        for(int num :nums){
            ans=num^ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3};
        System.out.println(singleNumber(nums));
    }
}
