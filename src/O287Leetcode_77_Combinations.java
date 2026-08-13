import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O287Leetcode_77_Combinations {
    public static void helper(List<List<Integer>>list,List<Integer>current,int n,int index,int k){
        if(current.size()==k){
            list.add(new ArrayList<>(current));
            return;
        }
        if(index>n)return;
        current.add(index);
        helper(list,current,n,index+1,k);
        //Now Backtrack
        current.remove(current.size()-1);
        helper(list,current,n,index+1,k);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        int index=1;
        helper(list,current,n,index,k);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
