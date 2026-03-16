public class O134Leetcode_762_Prime_Number_of_Set_Bits {
    public static int setBits(int n){
        int ans=0;
        while(n>0){
            //Finding bit is set bit or not
            if((n&1)==1){
                ans+=1;
            }
            //Shifting towards right
            n=n>>1;

        }
        return ans;
    }
    static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        int bits=0;
        for(int i=left;i<=right;i++){
            bits=setBits(i);
            if(isPrime(bits)==true)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int left=6;
        int right=10;
        System.out.println(countPrimeSetBits(left,right));
    }
}
