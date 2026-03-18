public class O135XOR_Till_N {
    //We need to find XOR till n
    //start from 0
    //       a            |         XOR from 0 to a
    // -------------------|---------------------------
    //       0            |         0
    //       1            |         1
    //       2            |         3
    //       3            |         0
    //       4            |         4
    //       6            |         7
    //       7            |         0
    //       8            |         8
    //       9            |         1
    //--------------------------------------------------
    //Observe the pattern
    //a%4==0  value is a
    //a%4==1  value is 1
    //a%4==2  value is a+1
    //a%4==3  value is 0
    //
    public static void main(String[] args) {
        System.out.println("Observe the table");
    }
    //XOR for all numbers between a and b would be
    //F(b)=Xor of all numbers from 0 till b
    //Xor of all numbers between a and b is
    //F(b)^(F(a-1)) --> as A^A=0
    //So XOR of numbers till b then xor till a-1 would be cancelled by xor of all numbers till a-1
}
