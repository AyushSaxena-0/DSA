import java.util.Scanner;
public class O13Fibonacci_Series {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        else {
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n];

        }
    }
    static int fibrec(int n){
        if (n<=1){
            return n;
        }
        else{
            return fibrec(n-1)+fibrec(n-2);
        }
    }

    static int kk(int n){
        if (n <= 1) {
            return n;
        }
        else{
            int a=0;
            int b=1;
            int count=1;
            int z=0;
            while(count<n){
                z=a+b;
                a=b;
                b=z;
                count++;
            }
            return z;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series term to find");
        int n=sc.nextInt();
        int ans=fib(n);
        int ans2=fibrec(n);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(kk(n));

    }

}
