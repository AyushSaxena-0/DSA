public class O269Leetcode_3345_Smallest_Divisible_Digit_Product_I {
    public static int productOfDigits(int n){
        int p=1;
        while(n>0){
            int digit=n%10;
            p=p*digit;
            n=n/10;
        }
        return p;
    }
    public static int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int p=productOfDigits(i);
            if(p%t==0)return i;
        }
        return 0;
    }
}
