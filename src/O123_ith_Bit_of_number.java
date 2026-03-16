public class O123_ith_Bit_of_number {
    public static void main(String[]args) {
        //i th bit of a number is called mask of number with i-1 zeros on right side of 1
        //      1   0   1   1   0   0   1   1   0
        //   &  0   0   0   1   0   0   0   0   0
        //-------------------------------------------
        //      0   0    0   1   0   0   0   0   0
        //-------------------------------------------
        //Take 1 and left shift it by n-1 places to left
        // 1<<(n-1)
        // n & (1<<5) We are finding the nth bit by using And
        // It helps us know mask of nth term

        //Set n th bit to 1
        //Find Mask then do OR operation on number and mask
        // n || (1<<n-1) to set the n th bit to 1

        //Reset the n th bit (Make it 0 if it was 1 or keep it 0 if was 0 before)
        //  1   1   0   0   1
        //  1   0   1   1   1
       // & ------------------
        //  1   0   0   0   1
        //  -------------------
        //Just take the mask and take the compliment of it
        //   n & (~(1<<(n-1)))

        //Range formulae for N bits
        //      -2^(N-1) to 2^(N-1)-1
        //Since 0 is positive so we take from 0 to 127 as total 128 positive numbers
        //-128 till -1 [Inclusive] is negative
    }
}
