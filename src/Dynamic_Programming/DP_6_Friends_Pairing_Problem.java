package Dynamic_Programming;

public class DP_6_Friends_Pairing_Problem {
    public static long helper(int n,long[]dp){
        if(n==1)return 1;
        if(n==2)return 2;
        if(dp[n]!=0)return dp[n];
        return dp[n]=helper(n-1,dp)+(n-1)*helper(n-2,dp);
    }
    public static long countFriendsPairings(int n) {
        long[]dp=new long[n+1];
        return helper(n,dp);
    }
    public static long topDown(int n){
        long[]dp=new long[n+1];
        //Note otherwise index out of bond would come
        //So keep in mind your range of n
        if(n>0)dp[1]=1;
        if(n>1)dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countFriendsPairings(4));
        System.out.println(topDown(4));
    }
}
