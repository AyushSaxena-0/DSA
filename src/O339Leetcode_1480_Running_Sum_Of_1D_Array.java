import java.util.Arrays;

public class O339Leetcode_1480_Running_Sum_Of_1D_Array {
    public static int[] runningSum(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];

        for(int i=n-1;i>=0;i--){
            int sum=0;
            int j=i;
            while(j>-1){
                sum=sum+nums[j];
                j--;
            }
            ans[i]=sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
