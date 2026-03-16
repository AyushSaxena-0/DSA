public class O130Leetcode_326_Power_Of_3 {
    public static boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
    //Alter you can also use log n base 3 and compare it with int value if they both are equal
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(6));
    }
}
