public class O160Recursion_Concept {
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--);
    }
    //You would have expected outcome to be 5 4 3 2 1 for the fun(5)
    public static void main(String[] args) {
        fun(10);
    }
}
