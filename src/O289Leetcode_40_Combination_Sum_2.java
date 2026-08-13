import java.util.*;
public class O289Leetcode_40_Combination_Sum_2 {
    public static void helper(List<List<Integer>>list,List<Integer>current,int target,int[]candidates,int index){
        if(target==0){
            if(!list.contains(current)){
                list.add(new ArrayList<>(current));
            }
            return;
        }
        if(index>=candidates.length||candidates[index]>target)return;
        //Now i am starting recursion
        //Pick
        current.add(candidates[index]);
        helper(list,current,target-candidates[index],candidates,index+1);
        //Skip
        //Here I am going to use backtracking
        current.remove(current.size()-1);
        int next=index+1;
        //If there is no repetation then we were anyway doing index+1 in next recursion so next=index+1 works same when used in recursive call
        //Note this step
        //How to avoid trivial comparisons
        while(next<candidates.length&&candidates[next]==candidates[index]){
            next++;
        }
        helper(list,current,target,candidates,next);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //Sort the array as the output is sorted form inside
        //Outside order doesnt matter
        Arrays.sort(candidates);
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(list,current,target,candidates,0);
        return list;
    }

    public static void main(String[] args) {
        int[]candidates={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candidates,target));
    }
}
