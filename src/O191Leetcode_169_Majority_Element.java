import java.util.HashMap;
import java.util.Map;

public class O191Leetcode_169_Majority_Element {
    public static int majorityElement(int[] nums) {
        //We are creating a Hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        //We are creating a hashmap with frequency
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int max=0;
        int ele=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ele=entry.getKey();
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        System.out.println(majorityElement(nums));
    }
}
