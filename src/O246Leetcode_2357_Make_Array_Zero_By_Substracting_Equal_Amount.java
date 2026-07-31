import java.util.Arrays;

public class O246Leetcode_2357_Make_Array_Zero_By_Substracting_Equal_Amount {
    public static int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        while(i<nums.length){
            //You need to copy value before as otherwise after first element gets modified other wont be substracted , they will be substracted with 0 after making first element 0
            int subEle=nums[i];
            if(nums[i]==0)i++;
            else{
                for(int j=i;j<nums.length;j++){
                    nums[j]=nums[j]-subEle;
                }
                ans++;
                i++;
            }
        }
        return ans;
    }

    static void main() {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
    }
}
