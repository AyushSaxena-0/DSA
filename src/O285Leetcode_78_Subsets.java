import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class O285Leetcode_78_Subsets {
    public static void helper(List<List<Integer>>list, List<Integer>current, int[]nums, int index){
        //Now here i am defining the base case
        if(index==nums.length){
            list.add(new ArrayList<>(current));
            //I need to return to stop the recursion
            return;
        }
        current.add(nums[index]);
        helper(list,current,nums,index+1);
        //Backtracking
        current.remove(current.size()-1);
        helper(list,current,nums,index+1);
        //Since all changes are done to the same object referance arraylist so we do not need this function to have a return type
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        int index=0;
        helper(list,current,nums,index);
        return list;
    }

    public static void main(String[] args) {
        int[]nums=new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
}
