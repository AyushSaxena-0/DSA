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
    //--------------------------------------------------
}
