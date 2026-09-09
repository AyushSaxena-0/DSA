public class O370Leetcode_3871_Count_Commas_In_Range_II {
    public static long countCommas(long n) {
        long ans=0;
        if(n>=1_000L){
            ans+=n-999L;
        }
        if(n>=1_000_000L){
            ans+=n-999999L;
        }
        if(n>=1_000_000_000L){
            ans+=n-999999999L;
        }
        if(n>=1_000_000_000_000L){
            ans+=n-999999999999L;
        }
        if(n>=1_000_000_000_000_000L){
            ans+=n-999999999999999L;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countCommas(1_000_000_000_000_000L));
    }
}
