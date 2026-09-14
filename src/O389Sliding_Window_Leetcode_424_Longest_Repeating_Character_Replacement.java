public class O389Sliding_Window_Leetcode_424_Longest_Repeating_Character_Replacement {
    public static int maxFreq(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            max=Math.max(max,x);
        }
        return max;
    }
    public static int characterReplacement(String s, int k) {
        int[]freq=new int[256];//All characters and symbols of keyboard come in this range so always make 256 length array
        int low=0;
        int maxLength=0;
        for(int high=0;high<s.length();high++){
            //Moved forward
            char ch=s.charAt(high);
            //Increased frequency of current element
            freq[ch]++;
            //Differance between freq of maximum frequnecy element and high-low+1 should be less than or equal to k
            int maxfreq=maxFreq(freq);
            while(high-low+1-maxfreq>k){
                freq[s.charAt(low)]--;
                low++;
            }
            maxLength=Math.max(maxLength,high-low+1);
            maxfreq=maxFreq(freq);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="AABAAAACD";
        System.out.println(characterReplacement(s,1));
    }
}
