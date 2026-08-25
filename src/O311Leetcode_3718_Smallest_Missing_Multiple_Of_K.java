import java.util.HashSet;
import java.util.Set;

public class O311Leetcode_3718_Smallest_Missing_Multiple_Of_K {
    public static int missingMultiple(int[] nums, int k) {
        //Creating a hashSet
        Set<Integer> set=new HashSet<>();
        //Solve by hashset
        for(int num:nums){
            set.add(num);
        }
        int multiple=k;
        //Iterate and check if set contains it then move to next multiple
        //When not found break and return that value of multiple
        while(set.contains(multiple)){
            multiple+=k;
        }
        //Answer is this
        return multiple;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        int k=2;
        System.out.println(missingMultiple(nums,k));
    }
}
