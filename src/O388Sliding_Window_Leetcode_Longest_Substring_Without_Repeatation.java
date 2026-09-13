import java.util.*;

public class O388Sliding_Window_Leetcode_Longest_Substring_Without_Repeatation {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int low=0;
        int maxLength=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(low));
                    low++;
                }
                set.add(ch);
            }
            maxLength=Math.max(maxLength,high-low+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
