public class O131Leetcode_342_Power_Of_4 {
    //This has floating point pre
    public static boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n-1)%3==0;
    }

    /*
    public boolean isPowerOfFour(int n) {
        //Note 0b followed by binary number shows you wrote in binary
        //     0x shows you wrote in hexadecimal
        //Power of 4 has at even places set bit 1
        return n > 0 && (n & (n-1)) == 0 && (n & 0b01010101010101010101010101010101) != 0;
    }
     */



    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
