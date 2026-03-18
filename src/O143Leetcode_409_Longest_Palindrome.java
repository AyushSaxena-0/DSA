import java.util.*;
public class O143Leetcode_409_Longest_Palindrome {
    public static int longestPalindrome(String s) {
        int ans=0;
        int count1=0;
        //Firstly i am creating a Hashmap
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //Checking even frequences and adding them to answer
        for(char ch:map.keySet()){
            if(map.get(ch)%2==0){
                ans+=map.get(ch);
            }
            else{
                if(map.get(ch)%2==1){
                    count1=1;
                }
                ans=ans+map.get(ch)-1;
            }
        }
        //if count of charecters with frequency 1 is greater than 1 then add 1 to answer (for odd palindrome)
        return ans+count1;
    }
    //Alter create an array of 128 length and at array[ch] increase frequency by one
    //then sum up all the frequency
    /*
    class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII

        // count frequency
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        int ans = 0;
        boolean hasOdd = false;

        // process frequencies
        for(int f : freq){
            ans += (f / 2) * 2;   // take even part
            if(f % 2 == 1){
                hasOdd = true;
            }
        }

        return hasOdd ? ans + 1 : ans;
    }
}
    */


    public static void main(String[] args) {
        String s="abbcccdddd";
        System.out.println(longestPalindrome(s));
    }
}
