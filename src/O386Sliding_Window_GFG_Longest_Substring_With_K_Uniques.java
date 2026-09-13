import java.util.HashMap;
import java.util.Map;

public class O386Sliding_Window_GFG_Longest_Substring_With_K_Uniques {
    public static int longestKSubstr(String s, int k) {
        // code here
        //I am going to use sliding window and two pointer here
        int max=-1;
        //Now start with sliding window and two pointer
        Map<Character,Integer> map=new HashMap<>();
        int low=0;
        for(int high=0;high<s.length();high++){
            //Increase window
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){

                //Shrink window from left
                char leftChar=s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;//Move low pointer
            }
            if(map.size()==k)max=Math.max(max,high-low+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s="abbbbbbbcbcbbzxcvbnm";
        int k=2;
        System.out.println(longestKSubstr(s,k));
    }
}
