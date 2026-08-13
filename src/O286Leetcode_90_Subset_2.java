import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O286Leetcode_90_Subset_2 {
    public static void helper(List<List<Integer>>list,List<Integer>current,int[]nums,int index){
        //I need to create a base case
        if(index==nums.length){
            if(!list.contains(current)){
                list.add(new ArrayList<>(current));
                //This is a stopping condition
            }
            return;
        }
        current.add(nums[index]);
        helper(list,current,nums,index+1);
        //Backtrack
        current.remove(current.size()-1);
        helper(list,current,nums,index+1);
        //I dont need to return anything because arrays is object type referencing
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        //Note required output is in sorted form so sort the array
        //Elements in arraylist outside could be in any order but inner cannot
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        int index=0;
        helper(list,current,nums,index);
        return list;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,4};
        System.out.println(subsetsWithDup(arr));
    }
}
