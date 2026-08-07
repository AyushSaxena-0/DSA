import java.util.Arrays;

public class O271Leetcode_338_Counting_Bits {
    public static int countones(int a){
        int count=0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        return count;
    }
    public static int[] countBits(int n) {
        //Creating an Array
        int[]arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=countones(i);
        }
        return arr;
    }
    public static int countBits2(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            //Or do
            //It removes the rightmost set bit
            //n=n-(n&-n)
            count++;
        }
        return count;
    }

    static void main() {
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(countBits2(5));
    }
}
