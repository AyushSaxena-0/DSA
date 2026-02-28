import java.util.*;

public class O93Leetcode_217_Contains_Duplicates {
    public static boolean containsDuplicate(int[] nums) {
        //Used Hashset and compared the number of elements
        Set<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        return (ans.size()!=nums.length);
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
