public class O223Leetcode_1143_Longest_Comman_Subsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        //I am going to use Dynamic programming here
        //Creating a 2D dp matrix
        int l1=text1.length();
        int l2=text2.length();
        int[][]dp=new int[l1+1][l2+1];
        /*

                  Blank   a     b    c    d     e

            Blank   0      0     0    0    0     0

            a       0      1     1    1    1    1

            c       0      1     1    2    2    2

            e       0      1     1    2    2    3


        */
        //If character at index i of one string matches character at index j of other string
        //Then do the following
        //dp[i-1][j-1]+1 it means that matching alphabets before this matching charecter +1 as the character matches
        //Else do Math.max(dp[i-1][j],dp[i][j-1])
        //Return the last value in last row and last column
        //Since java makes elements of array of primitives as 0 by default so no need to handle empty string case that is first row and first column

        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){//We do i-1 and j-1 as we are starting from 0 in string text1 and text2 and in dp matrix we have index starting from 1
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];


    }

    static void main() {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }
}
