import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O377Leetcode_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //Three sum is just two sum n times
        //Fix one number then choose two numbers then apply two sum
        //Avoid duplicates by while loop
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            if(i>0&&nums[i]==nums[i-1])continue;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==0){
                    //Create a new ArrayList and then add all three elements in it after checking if it contains them
                    List<Integer>curr=new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[left]);
                    curr.add(nums[right]);
                    list.add(curr);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1])left++;
                    //Since already i moved right right by one so it won't go arrayIndexOutOfBound
                    while(left<right&&nums[right]==nums[right+1])right--;

                }
                else if(sum<0){
                    //Move the element at left ahead
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[]nums=new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
