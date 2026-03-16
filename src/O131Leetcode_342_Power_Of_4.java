public class O131Leetcode_342_Power_Of_4 {
    //This has floating point pre
    public static boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n-1)%3==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
