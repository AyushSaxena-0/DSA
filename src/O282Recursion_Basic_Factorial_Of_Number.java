public class O282Recursion_Basic_Factorial_Of_Number {

    public static int fact(int n){
        if(n<=1)return 1;
        return n*fact(n-1);
    }
    static void main() {
        int x=fact(5);
        System.out.println(x);
    }
}
