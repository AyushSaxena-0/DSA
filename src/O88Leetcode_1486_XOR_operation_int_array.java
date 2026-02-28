public class O88Leetcode_1486_XOR_operation_int_array {
    public static int xorOperation(int n, int start) {
        //Note that a^0=0^a=a {so xor with 0 does nothing}
        //0^0=0
        //It is different from multiplication by 0
        //a^a=1 thus could be used to find duplicate
        int xor=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            xor=xor^nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int n=10;
        int start=65;
        System.out.println(xorOperation(start,n));
    }
}
