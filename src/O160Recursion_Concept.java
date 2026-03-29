public class O160Recursion_Concept {
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun1(n--);
    }
    //You would have expected outcome to be 5 4 3 2 1 for the fun(5)
    //But it is an infinite recursion as the value never get decremented in this function
    //as value would be decremented after using it
    static void fun2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //This decrements first then enter in the function
        fun2(--n);
    }
    public static void main(String[] args) {

//        fun1(10);
        fun2(10);
    }
}
