import java.util.HashMap;
import java.util.Map;

public class O400Prefix_Sum_Leetcode_974_Subarray_Sums_Divisible_By_K {
    public static int subarraysDivByK(int[] nums, int k) {
        //Create a count variable
        int count=0;
        //Maintain the sum
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        //Exactly one way of getting 0
        map.put(0,1);
        for(int num:nums){
            //Calculate sum of Subarray
            sum+=num;
            //Calculate remainder needed for getting multiple of k
            int rem=sum%k;
            //Note this conditions
        /*
            -2 + 6 = 4
            4 + 6 = 10
            10 + 6 = 16
        */
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(subarraysDivByK(arr,2));
    }
}
