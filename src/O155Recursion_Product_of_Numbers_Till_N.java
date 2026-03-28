public class O155Recursion_Product_of_Numbers_Till_N {
    //Factorial of a number
    static int fun1(int n){
     if(n==0){
         return 1;
     }
     return n*fun1(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fun1(5));
    }
}
