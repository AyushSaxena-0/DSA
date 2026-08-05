import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class O267Leetcode_3731_Find_Missing_Elements {
    public static List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            set.add(num);
            if(min>num)min=num;
            if(max<num)max=num;
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))list.add(i);
        }
        return list;
    }
    //Alternative is creating a new array of length 101
    //As maximum elements in array is given in question
    //then make all elements of new array as false and then mark the elements present in the input array as true
    //Then iterate through the new array and add all the elements which are false to the list
    static void main() {
        int[]nums={3,4,5,6,9};
        System.out.println(findMissingElements(nums));
    }
}
