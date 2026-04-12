package Dynamic_Programming;

public class DP_1_Basic_Intro {

    //DP stands for Dynamic programming
    //It is a misleading name because mathematics was not considered good at that time
    //They might be murdered if they study maths
    //Hence the misleading name for life safety
    //DP is Advanced Recursion

    //Prerequisite
    //Recursion Basics
    //Arrays
    //2D Arrays Basics
    //HashMap Basics
    //Trees Basics
    //Dp fixes overlapping SubProblems by storing it in array
    //So saving the value in array is called Memoisation
    //Reduces the time complexity from O(2^N) to O(n)
    //Total function calls which are reduced 2^N-1
    //Space complexity becomes O(N)

    //Recursion+Memoisation =Top Down dp

    public static int helper(int[]dp,int n){
        //This is Dp solution
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        dp[n]=helper(dp,n-1)+helper(dp,n-2);
        return dp[n];
    }
    public static int fib(int n) {
        int[]dp=new int[n+1];
        return helper(dp,n);
    }
    public static int fibrec(int n){
        if(n<=1)return n;
        return fibrec(n-1)+fibrec(n-2);
    }
    public static int fiboIterative(int n){
        if(n<=1)return n;
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        //This is recursive dp (Type 1)
        System.out.println(fib(40));
        //This takes so much time by recursion
        System.out.println(fibrec(40));
        //This is using Iterative DP (Type 2) Known as bottom up DP
    }
}
