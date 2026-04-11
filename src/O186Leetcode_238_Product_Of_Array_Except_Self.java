import java.util.Arrays;

public class O186Leetcode_238_Product_Of_Array_Except_Self {
    public static int productEx(int[]nums,int index){
        //For Special Case
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(i!=index){
                prod=prod*nums[i];
            }
        }
        return prod;
    }
    public static int[] productExceptSelf(int[] nums) {
        int[]ans=new int[nums.length];
        int prod=1;
        //For normal cases we keep product and divide number if element is non zero
        for(int num:nums){
            prod=prod*num;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                //General Case
                ans[i]=prod/nums[i];
            }
            else{
                ans[i]=productEx(nums,i);
            }
        }
        return ans;
    }
    public static int[] productExceptSelf2(int[] nums) {
        //This is optimized approach by using prefix product and suffix product
        //Calculating prefix product
        int n=nums.length;
        int[]ans=new int[n];
        //calculating pefix product
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        //Calculating suffix product
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }
}
