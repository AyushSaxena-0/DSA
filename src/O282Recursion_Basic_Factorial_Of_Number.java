public class O282Recursion_Basic_Factorial_Of_Number {

    static int fact(int n){
        if(n<=1)return 1;
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n<=1)return n;
        return n+sum(n-1);
    }
    static void main() {
        int x=fact(5);
        int y=sum(5);
        System.out.println(x);
        System.out.println(y);
    }
}
