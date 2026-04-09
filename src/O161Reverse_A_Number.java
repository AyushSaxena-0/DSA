public class O161Reverse_A_Number {
    //We have used a global static variable 
    static int rev=0;
    static int fun(int n) {
        if (n == 0) {
    //Note 0%10=0 but it would stop at one digit won't go below
            return rev;
        }
        rev= rev*10 + n%10;
        fun(n/10);
        return rev;
    }
    static int way2(int n,int ans){
        if(n==0)return ans;
        return way2(n/10,ans*10+n%10);
    }
    static boolean isPalindrome(int n){
        return n==way2(n,0);
    }

    public static void main(String[] args) {
        System.out.println(fun(123456789));
        System.out.println(way2(123456789,0));
        System.out.println(isPalindrome(121));
    }

}
