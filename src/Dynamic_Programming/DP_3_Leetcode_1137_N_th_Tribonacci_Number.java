package Dynamic_Programming;

public class DP_3_Leetcode_1137_N_th_Tribonacci_Number {
    public static int tribonacci(int n) {
        //Solving it by using iterative dp
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static int trib(int n){
        //Alter We don't need an array as only last two numbers are needed
        //Arrays are used where all iterations needed to be stored
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        int a=0;
        int b=1;
        int c=1;
        int ans=0;
        for(int i=3;i<=n;i++){
            ans=a+b+c;
            a=b;
            b=c;
            c=ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(10));
        System.out.println(trib(10));
    }
}
