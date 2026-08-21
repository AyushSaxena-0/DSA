public class O232_DP_7_Dearrangements {
    //So since Leetcode 634 is a premium and paid problem for subscribed members only
    //So here I tell you the exact question
    //Problem: Given n, count the number of permutations of [0,1,2,...,n-1]
    // where no element remains in its original position.
    //n = 3
    //Original: 0 1 2
    //
    //Derangements:
    //1 2 0
    //2 0 1
    //
    //Answer = 2
    public static int dearrangements(int n){
        //Basically you need to remember this recurrence relation
        //F(N)=(N-1){F(N-1)+F(N-2)}
        //Using iterative dp
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(dearrangements(4));
    }

}
