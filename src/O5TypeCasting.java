import java.util.Scanner;

public class O5TypeCasting {
    public static void main(String[] args) {

        /*
         * Implicit Type Casting (Widening Conversion)
         * int → float is automatic because float is a larger data type
         */
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextInt();   // int is automatically converted to float
//        System.out.println(num);

        /*
         * Explicit Type Casting (Narrowing Conversion)
         * float → int requires explicit cast because int is a smaller data type
         */
//        float a = 34.56f;
//        int b = (int) a;           // fractional part is lost
//        System.out.println(b);

        /*
         * Byte Overflow Example
         * byte range: -128 to 127
         * 257 % 256 = 1 → overflow occurs
         */
//        byte c = (byte) 257;
//        System.out.println(c);

        /*
         * Type Promotion in Expressions
         * byte, short, char are promoted to int during arithmetic operations
         */
//        byte x = 50;
//        byte y = 40;
//        int z = 100;
//        int d = x * y / z;         // expression evaluated as int
//        System.out.println(d);

        /*
         * Character to Integer Conversion
         * char is internally stored as Unicode value
         */
        int c = 'a';                // 'a' → Unicode value 97
        int d = 'A';                // 'A' → Unicode value 65
        System.out.println(c);
        System.out.println(d);

        /*
         * Unicode Support in Java
         * Java uses Unicode, so multiple languages are supported
         */
        System.out.println("नमस्ते");   // Hindi
        System.out.println("你好");      // Chinese

        /*
         * Type Promotion in Mixed Expressions
         * int is promoted to float
         * int * float = float
         */
        System.out.println(3 * 5.64678f); // result is float
    }
}
