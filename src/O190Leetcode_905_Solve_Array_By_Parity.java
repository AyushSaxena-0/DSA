import java.util.ArrayList;
import java.util.Arrays;

public class O190Leetcode_905_Solve_Array_By_Parity {
    public static int[] sortArrayByParity1(int[] nums) {

        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        for(int num:nums){
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }

        even.addAll(odd);

        for(int i=0;i<even.size();i++){
            nums[i]=even.get(i);
        }
        return nums;
    }
    public static int[] sortArrayByParityOptimised(int[] nums) {
        int[]ans=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[left++]=nums[i];
            }
            else{
                ans[right--]=nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,5,6,7,8,9,10};
        System.out.println(Arrays.toString(sortArrayByParity1(nums)));
        //Both outputs are slightly different but both are correct
        System.out.println(Arrays.toString(sortArrayByParityOptimised(nums)));
    }
}
