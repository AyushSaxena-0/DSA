import java.util.*;
public class O303Leetcode_3471_Find_The_Largest_Almost_Missing_Integer {
    public static void helper(int[]nums,int k,List<List<Integer>>list,List<Integer>current,int start,int end,int index){
        //I am creating subarrays of size k and storing them in ArrayList
        if(end>=nums.length)return;
        if(index>end){
            list.add(new ArrayList<>(current));
            //Note this method
            //Clears all element in the list
            current.clear();
            // Move window one position forward
            helper(nums,k,list,current,start+1,end+1,start+1);
            return;
        }
        //Otherwise add the element in current list
        current.add(nums[index]);
        //Move ahead
        helper(nums,k,list,current,start,end,index+1);
    }
    public static int largestInteger(int[] nums, int k) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(nums,k,list,current,0,k-1,0);
        //Above passed arrayList is modified
        //Now list contains all the subarrays of size k
        //Now i want to iterate over entire array and generate a frequency map of every element in array with its frequency in arraylist of arraylists
        Map<Integer, Integer> map = new HashMap<>();

        for(List<Integer> subarray : list) {
            //Other wise if element is repeated in one subarray say [0,0] it would make frequency 2
            //Which is not true as per question, it asks weather it repeats amoung diffrent arraylists
            //Repeating amoung themselves should not cause problem
            Set<Integer> set = new HashSet<>(subarray);
            for (int num : set) {
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        //Find largest element whose frequency is 1
        int ans = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={3,9,2,1,7};
        int k=3;
        System.out.println(largestInteger(nums,k));
    }
}
