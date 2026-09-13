import java.util.HashMap;
import java.util.Map;

public class O387Sliding_Window_Leetcode_904 {
    public static int totalFruit(int[] fruits) {
        //This is a version of largest subarray with k unique characters
        //Max unique elements are 2
        int low=0;
        int maxLength=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                //Remove elements from left
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            maxLength=Math.max(maxLength,high-low+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[]fruits={1,1,1,3,3,5,5};
        System.out.println(totalFruit(fruits));
    }
}
