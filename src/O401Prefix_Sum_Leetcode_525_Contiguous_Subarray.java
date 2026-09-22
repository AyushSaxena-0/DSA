import java.util.HashMap;
import java.util.Map;

public class O401Prefix_Sum_Leetcode_525_Contiguous_Subarray {
    public static int findMaxLength(int[] nums) {
        //Put -1 in place of zero look for -sum
        int max=-1;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else{
                sum+=1;
            }//If prefix[i] and prefix[j] have same sum when j>i then the subarray between i and j has sum equal to 0
            if(map.containsKey(sum)){
                //If the sum is there then we do not add index again as the older the index is the larger the subarray becomes
                max=Math.max(max,i-map.get(sum));
            }else{//Put the sum in array
                map.put(sum,i);
            }
        }//If the max was -1 then there was no such subarray return  0
        return max==-1?0:max;
    }

    public static void main(String[] args) {
        int[]arr={0,1,1,1,0,0,0};
        System.out.println(findMaxLength(arr));
    }
}
