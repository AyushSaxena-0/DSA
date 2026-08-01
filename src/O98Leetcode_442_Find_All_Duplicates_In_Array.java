import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class O98Leetcode_442_Find_All_Duplicates_In_Array {
    public static void swap(int[]arr,int i,int j){
        //I keep doing mistake in swap function
        //Do carefully
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void cycleSort(int[]nums){
        int i=0;
        while(i<nums.length){
            //Loop will always run till last index of array so always use i<nums.length
            if(nums[i]==i+1){
                //Case when element is sorted
                //At right location
                //Move forward
                i++;
            }
            else {
                //Correct index should be nums[i]-1 for wrong element at index i
                int correctindex=nums[i]-1;
                if(nums[i]!=nums[correctindex]){
                    //If duplicate is not present on correct location swap
                    //We check to avoid infinite loop of swapping duplicates at correct location
                    swap(nums,i,correctindex);
                }
                //If duplicate is present we move forward to other elements for sorting leaving it
                else{
                    i++;
                }

            }
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    //Alternative use Hashmap to keep visited and if again is found then append in list
    public static List<Integer> findDuplicates2(int[] nums) {
        //I am going to solve it by using Hashmap
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int num:nums){
            if(map.containsKey(num)){
                ans.add(num);
            }
            else{
                map.put(num,1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={5,4,3,2,1,1,4,5};
        System.out.println(findDuplicates(nums));
        System.out.println(findDuplicates2(nums));
    }
}
