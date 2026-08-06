public class O272Leetcode_461_Hamming_Distance {
    public static int hammingDistance(int x, int y) {
        int count=0;
        while(x>0||y>0){
            //Bits of both at same place should be diffrent so i am going to do this
            if((x&1)!=(y&1))count++;
            x=x>>1;
            y=y>>1;
        }
        return count;
    }

    static void main() {
        System.out.println(hammingDistance(1,4));
    }
}
