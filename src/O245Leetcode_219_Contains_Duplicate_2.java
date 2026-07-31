import java.util.*;
public class O245Leetcode_219_Contains_Duplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //Create a Hashmap and iterate through it if it countains key element then calculate the value of abs(i-j)<=k if yes return true or update the value
        Map<Integer,Integer>map=new HashMap<>();
        //Now iterating again to check if required condition is met or not
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prevIndex=map.get(nums[i]);

                if(i-prevIndex<=k)return true;
            }
            //Update index if condition is not met new index bbecomes this
            map.put(nums[i],i);
        }
        return false;
    }

    static void main() {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }
}
