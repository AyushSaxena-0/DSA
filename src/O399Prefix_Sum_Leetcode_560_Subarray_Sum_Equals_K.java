import java.util.HashMap;
import java.util.Map;

public class O399Prefix_Sum_Leetcode_560_Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        //This is default frequency
        //0 have one frequency
        map.put(0,1);
        //Since the prefix sum always move from left to right thus the subarrays are always on left side of subarrays choosen ,hence no issue
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(subarraySum(nums,3));
    }
}
