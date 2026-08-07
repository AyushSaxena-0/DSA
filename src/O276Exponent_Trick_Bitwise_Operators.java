public class O276Exponent_Trick_Bitwise_Operators {

    static int exp(int b, int p) {
        // Every number can be written as a sum of powers of 2.
        // Example:
        // 13 = 2^3 + 2^2 + 2^0
        //
        // Therefore:
        // 3^13 = 3^(8 + 4 + 1)
        //      = 3^8 * 3^4 * 3^1
        int ans = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                ans = ans * b;
            }
            b = b * b;
            p = p >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(exp(3, 5)); // 243
    }
}