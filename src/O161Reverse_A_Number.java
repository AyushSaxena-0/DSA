public class O161Reverse_A_Number {
    //We have used a global static variable 
    static int rev=0;
    static int fun(int n) {
        if (n % 10 == n) {
            return n;
        }
        rev= rev*10 + n%10;
        fun(n/10);
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(fun(123456789));
    }
}
