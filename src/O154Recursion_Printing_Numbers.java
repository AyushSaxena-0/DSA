public class O154Recursion_Printing_Numbers {
    static void fun1(int n){
        if(n==0){
            return;
        }
        //It will print 5 4 3 2 1
        System.out.println(n);
        fun1(n-1);
    }
    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        //It will print 1 2 3 4 5
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun1(5);
        fun2(5);
    }
}
