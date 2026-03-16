public class O126Number_Of_Digits_B_Representation {
    //Note we need to find number of bits in binary representation of number
    //We have a formulae Log n  +  1
    //                   ------
    //                   Log b
    //Log n to the base b
    //
    static int digits(int num,int base){
        return((int)(Math.log(num)/Math.log(base))+1);
    }

    public static void main(String[] args) {
        System.out.println(digits(34567,10));
    }
}
