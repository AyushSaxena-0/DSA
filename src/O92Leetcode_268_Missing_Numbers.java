public class O92Leetcode_268_Missing_Numbers {
    //n would be one more than length of current array
    // as one mor element would give us nums.length-1+1=nums.length as value of n
    public static int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int num:nums){
            sum+=num;
        }
        //use sum of n natural numbers=n*(n+1)/2;
        //subtract array element's sum from theoretical sum
        //Also note it is inclusive of 0 and n
        int tsum=n*(n+1)/2;
        return tsum-sum;
    }

    public static void main(String[] args) {
        int []nums={0,1,2,3};
        System.out.println(missingNumber(nums));
    }
}
