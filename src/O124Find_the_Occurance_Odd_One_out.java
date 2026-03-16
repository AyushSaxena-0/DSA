public class O124Find_the_Occurance_Odd_One_out {
    //Find the number which has not appeared the 3 times (7 times)
    static int ans(int[] nums){
        //We would not be doing modulo with 3 as the remainder would not be the answer
        //That would be true for each set bit (1),so count 1 ,
        //if they are not multiple of three they are answer
        //Suppose the number is 6 only one time but (sum%3==0) would be 0
        //So our logic fails
        //For 5 or 7 times use count%5 or count%7
        int result =0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if((nums[j] & (1<<i))!=0){
                    count++;
                }
            }
            if(count%3!=0){
                result |=(1<<i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums={2,2,2,3,3,3,5,5,5,6,7,7,7};
        System.out.println(ans(nums));
    }
}
