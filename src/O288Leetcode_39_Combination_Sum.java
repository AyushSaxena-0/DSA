import java.util.ArrayList;
import java.util.List;

public class O288Leetcode_39_Combination_Sum {
    public static void helper(List<List<Integer>>list, List<Integer>current, int target, int[]candidates, int index){
        //This is the base condition
        if(target==0){
            if(!list.contains(current)){
                list.add(new ArrayList<>(current));
            }
        }
        if(index>=candidates.length||target<0)return;
        //Now i am going to use recursiona dn backtracking
        //Either pick this and move ahead or don't pick and move ahead
        //Also since you can choose again so repetation is also possible
        current.add(candidates[index]);
        //Choose and move ahead
        helper(list,current,target-candidates[index],candidates,index);
        //Backtrack
        current.remove(current.size()-1);
        //Skip
        helper(list,current,target,candidates,index+1);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(list,current,target,candidates,0);
        return list;
    }

    public static void main(String[] args) {
        int[]candidates={2,3,6,7};
        System.out.println(combinationSum(candidates,7));
    }
}
