public class O136Range_XOR {
    //Calculating xor by for loop would cause O(N) time complexities
    static int xor_from_0_to_n(int n){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else{
            return 0;
        }
    }
    static int range_xor_from_A_to_B(int a,int b){
        //XOR for all numbers between a and b would be
        //F(b)=Xor of all numbers from 0 till b
        //Xor of all numbers between a and b is
        //F(b)^(F(a-1)) --> as A^A=0
        //So XOR of numbers till b then xor till a-1 would be cancelled by xor of all numbers till a-1
        return xor_from_0_to_n(b)^xor_from_0_to_n(a-1);
    }

    public static void main(String[] args) {
        int a=10;
        int b=19;
        System.out.println(range_xor_from_A_to_B(a,b));
    }
}
