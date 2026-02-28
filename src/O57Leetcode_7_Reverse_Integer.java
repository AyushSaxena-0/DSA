public class O57Leetcode_7_Reverse_Integer {
    static int reverse(int x) {
        int once=0;
        int rev=0;
        while(x!=0){
            once=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10 ||(rev==Integer.MAX_VALUE/10 && once>7)){
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && once < -8)) {
                return 0;
            }
            rev=rev*10+once;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-12345));
    }
}
