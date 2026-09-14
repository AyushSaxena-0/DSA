public class O390Sliding_Window_Leetcode_1004_Max_Consecutive_Ones_III {
    public static int maxFreq(int[]freq){
        int max=0;
        for(int x:freq){
            max=Math.max(max,x);
        }
        return max;
    }
    public static int longestOnes(int[] nums, int k) {
        //Simple two pointer
        int low=0;
        //Here you need not create hashmap only zeros and ones are there
        int zeros=0;
        int maxOnes=0;
        int[]freq=new int[256];
        for(int high=0;high<nums.length;high++){
            //Added in hashmap (Frequency map here)
            if(nums[high]==0)zeros++;
            int maxfreq=maxFreq(freq);
            //Differance high-low+1-maxfreq>k reduce freq of low and increase low pointer
            while(zeros>k){
                if(nums[low]==0){
                    zeros--;
                }
                low++;
            }
            maxOnes=Math.max(maxOnes,high-low+1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,0,0,0,1,1,1};
        System.out.println(longestOnes(nums,2));
    }
}
