import java.util.ArrayList;
import java.util.List;

public class O216Permutations_on_Array_Integer_elements {
    public static void backtrack(int[]nums,boolean[] visited,List<Integer>path,List<List<Integer>>ans){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }


        //Now writing the logic
        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;

            //Add the element in path
            path.add(nums[i]);
            visited[i]=true;

            //Exploring more
            backtrack(nums,visited,path,ans);

            //Unchoose backtrack
            path.remove(path.size()-1);
            visited[i]=false;
        }

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean[]visited=new boolean[nums.length];
        backtrack(nums,visited,new ArrayList<>(),ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
