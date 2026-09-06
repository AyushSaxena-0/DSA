import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O349Leetcode_1287_Element_Appearing_More_Than_25_Percent_Times {
    //Alter this is sorted array so you can use arr[i]==arr[i+1] then count++ else reset count
    public static int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()*4>arr.length)return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={1,1,1,1,2,2,2,4};
        System.out.println(findSpecialInteger(arr));
    }
}
