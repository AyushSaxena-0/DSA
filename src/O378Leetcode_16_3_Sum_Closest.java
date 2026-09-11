import java.util.Arrays;

public class O378Leetcode_16_3_Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int minDiff=Integer.MAX_VALUE;
        int closestSum=0;
        Arrays.sort(nums);
        //Read the question carefully
        for(int i=0;i<nums.length-1;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==target){
                    //Create a new ArrayList and then add all three elements in it after checking if it contains them
                    minDiff=0;
                    //Save the sum as it is to be returned
                    closestSum=sum;
                    left++;
                    right--;
                    return closestSum;
                }
                else if(sum<target){
                    //Move the element at left ahead
                    if(Math.abs(sum-target)<minDiff){minDiff=Math.abs(target-sum);
                        //If sum diff is less then save this sum
                        //If differance is less then minDiff update both closes sum and minDiff
                        closestSum=sum;
                    }
                    left++;
                }
                else{
                    if(Math.abs(sum-target)<minDiff){minDiff=Math.abs(target-sum);
                        //If differance is less then minDiff update both closes sum and minDiff
                        closestSum=sum;
                    }
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[]nums=new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSumClosest(nums,0));
    }
}
