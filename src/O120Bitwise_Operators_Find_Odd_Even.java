public class O120Bitwise_Operators_Find_Odd_Even {
     static boolean isOdd(int number){

         return (number & 1)==1;
     }
     public static void main(String[] args) {

         System.out.println(isOdd(7));
    }
}
