public class O273Leetcode_190_Reverse_Bits {
    public static int reverseBits(int n) {
        /*
        After -8>>1     equals to -4 in value
        11111111 11111111 11111111 11111000
        After -8>>>1:   equals to in value 2147483644
        01111111 11111111 11111111 11111100

        Observe that the new addded in >>> is 0 thus makes the negative number positive
        while >> new added on left would be 1 to preserve its negative answers
        */
        int ans=0;
        int i=0;
        while(i<32){
            //Note <<< does not exists
            //only >>>, << ,>> exists
            ans=(ans<<1)|(n&1);
            n=n>>>1;
            i++;
        }
        return ans;
    }

    static void main() {
        System.out.println(reverseBits(-8));
    }
}
