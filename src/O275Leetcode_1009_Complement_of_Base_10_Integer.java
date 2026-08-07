public class O275Leetcode_1009_Complement_of_Base_10_Integer {
    public static int bitwiseComplement(int n) {
        if(n==0)return 1;
        int mask=0;
        int temp=n;
        while(temp>0){
            mask=(mask<<1)|1;
            temp=temp>>1;
        }
        return (~n)&mask;
    }

    static void main() {
        System.out.println(bitwiseComplement(5));
    }
}
