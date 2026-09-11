import java.util.Arrays;

public class O379GFG_Triplets_With_Smaller_Sum {
    public static int countTriplets(int target, int []nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum>=target){
                    right--;
                }
                else{//This counts all the possible answers in the range [left,right]
                    //As all elements between have sum less than target
                    count+=(right-left);
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums=new int[]{-1,0,1,2,-1,-4};
        int target=3;
        System.out.println(countTriplets(target,nums));
    }
}
