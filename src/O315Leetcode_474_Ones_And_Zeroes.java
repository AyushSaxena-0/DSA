import java.util.Arrays;

public class O315Leetcode_474_Ones_And_Zeroes {
    //Bro this is the subset
    public static void helper(String str,int []ans,int index){
        //[zeros , ones]
        //Base case of recursion
        if(index<0)return ;
        //if zeros increment zero by one vice versa for one
        if(str.charAt(index)=='0')ans[0]+=1;
        else if(str.charAt(index)=='1')ans[1]+=1;

        helper(str,ans,index-1);
        return;
    }
    public static int helper2(String[]strs,int m,int n,int index,int[][][]dp){
        int[] ans = {0, 0};
        if(index<0)return 0;
        if(m<0||n<0)return 0;
        if(dp[index][m][n] != -1)return dp[index][m][n];
        helper(strs[index],ans,strs[index].length()-1);
        int pick=0;
        if(ans[0]<=m && ans[1]<=n)pick=1+helper2(strs,m-ans[0],n-ans[1],index-1,dp);
        int skip=helper2(strs,m,n,index-1,dp);
        return dp[index][m][n]=Math.max(pick,skip);
    }
    public static int findMaxForm(String[] strs, int m, int n) {
        int count=0;
        int[]ans={0,0};
        //Now we need to recursively move in array counting 0 and ones doing pick and skip if we reach target m,n=0 then count++ otherwise skip
        int[][][]dp=new int[strs.length][m+1][n+1];
        for(int i=0;i<strs.length;i++){
            for(int[] arr:dp[i]){
                Arrays.fill(arr,-1);
            }
        }
        return helper2(strs,m,n,strs.length-1,dp);
    }

    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        System.out.println(findMaxForm(strs, m, n));
    }
}
