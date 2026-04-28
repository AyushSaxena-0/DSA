import java.util.*;
import java.util.ArrayList;
    class Solution {
        public static void backtrack(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> ans) {

            if (path.size() == nums.length) {
                ans.add(new ArrayList<>(path));
                return;
            }
//Now I am looping and would ignore same
//I have already sorted the nums for collecting same elements consecutively
            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) continue;
                //Note our indexing is based upon index in nums not value in nums so duplicate values will have diffrent consecutive indexes hence we can use this
//Among identical elements, only the first unused one can be chosen at a given recursion level.
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
                //choose
                visited[i] = true;
                path.add(nums[i]);

                //explore
                backtrack(nums, visited, path, ans);

                //undo
                path.remove(path.size() - 1);
                visited[i] = false;

            }
        }

        public static List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            boolean[] visited = new boolean[nums.length];
            backtrack(nums, visited, new ArrayList<Integer>(), ans);
            return ans;
        }


        public static void main(String[] args) {
            System.out.println(permuteUnique(new int[]{1, 1, 2, 3}));
        }
    }

