public class O159Recursion_Product_Of_Digits {
    static int pod(int n){
        //Don't return 0 as it would make the product 0 always
        if(n%10==n){
            return n;
        }
        return (n%10)*pod(n/10);
    }

    public static void main(String[] args) {
        System.out.println(pod(12345));
    }
}
