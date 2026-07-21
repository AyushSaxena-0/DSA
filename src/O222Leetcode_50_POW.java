public class O222Leetcode_50_POW {
    public static double myPow(double x, int n) {
    //Alternative is use recursive approach
        if(x==0)return 0;
        else if(x==1)return 1;
        else if(x==-1){
            if(n%2==1)return-1;
            return 1;
        }
        else if(n<0){
            x=1/x;
            if(n==Integer.MIN_VALUE)return 0;
            n=-1*n;
        }
        double ans=1;
        while(n>0){
            ans=ans*x;
            n=n-1;
        }
        return ans;
    }

    static void main() {
        System.out.println(myPow(2.00000, 10));
    }
}
