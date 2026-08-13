import java.util.*;
public class O290Leetcode_216_Combination_Sum_III {
    public static void helper(List<List<Integer>>list,List<Integer>current,int k,int n,int currentnum){
        //Base Case
        if(current.size()==k&&n==0){
            if(!list.contains(current)){
                list.add(new ArrayList<>(current));
            }
            return;
        }//Stopping
        if(currentnum<1||currentnum>9||currentnum>n)return;
        //Pick
        current.add(currentnum);
        helper(list,current,k,n-currentnum,currentnum+1);
        current.remove(current.size()-1);
        //Backtrack
        helper(list,current,k,n,currentnum+1);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(list,current,k,n,1);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
}
