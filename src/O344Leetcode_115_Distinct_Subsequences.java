import java.util.Arrays;

public class O344Leetcode_115_Distinct_Subsequences {
    public static int helper(String s,String t,int i,int j,int[][]dp){
        //Pick if they match and move forward
        //When j reaches the end of t, it means we have successfully matched every character of t, so that particular recursive path represents one valid subsequence and we return 1.
        if(j==t.length())return 1;
        //We are handling if nothing is found equal here
        if(i==s.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            //Note that if both characters are eqaul only then we are moving ahead in this if block
            //Now also there are two choice pick or skip
            int pick=helper(s,t,i+1,j+1,dp);
            int skip=helper(s,t,i+1,j,dp);
            return dp[i][j]=pick+skip;
        }
        else{
            //Move ahead i
            return dp[i][j]=helper(s,t,i+1,j,dp);
        }
    }
    public static int numDistinct(String s, String t) {
        int[][]dp=new int[s.length()+1][t.length()+1];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(s,t,0,0,dp);
    }
    /*
        Subsequence: Characters can be skipped, but their original order must remain the same.
        Substring: Characters must be continuous/consecutive in the original text.
    */
    public static void main(String[] args) {
        String s="Axyzbc";
        String t="Abc";
        System.out.println(numDistinct(s,t));
        System.out.println(numDistinct("rabbbit","rabit"));
    }
}
