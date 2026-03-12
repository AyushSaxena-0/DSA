public class O119Bitwise_Operators {
    //AND
    // It is true when both are true
    // a & 1 == 1 then number is odd
    // Otherwise even
    // When we AND any number with 1 as equal number of digits we get same number
    // 1011 & 1111 = 1011

    //OR
    //It is true when either one statement is true of both
    // a || b = 1
    // At Least one of them is true

    //XOR
    //It is true when both statements are different
    // (A⋅B')+(A'⋅B)
    // 0 ^ 1 = 1
    // 0 ^ 0 = 0
    // 1 ^ 1 = 0
    // 1 ^ 0 = 1
    // a ^ 1 = a'

    //Compliment
    //If a=1
    // ~a=0

    //Bitwise Operator
    //Left shift operator
    // Observe
    // left shifting any number by 1 make it double of original value
    // a << 1
    // 1010 = 10
    // 1010 << 1 = 10100 = 20
    // 10 << 1 = 20
    // a<<b = (a)*2^b
    //Right shift operator
    // Denoted by >>
    // 0011001 >> 1 = 001100 or 1100 (Left zeros are ignored)
    //Right shifting works as division
    // a >> b = a/2^b
    public static void main(String[]args) {

        System.out.println("Bitwise Operators are part of Basic Maths");
    }

}
