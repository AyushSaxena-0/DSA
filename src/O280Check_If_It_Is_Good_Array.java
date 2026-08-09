public class O280Check_If_It_Is_Good_Array {
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static boolean isGoodArray(int[] nums) {
        int g=0;
        for(int i=0;i<nums.length;i++){
            //Note here you have to find the gcd of entire array not pairs
            //Otherwise if no two pair have gcd as 1 then it would give false but could be true
            /*
            gcd(6, 10, 15)
            = gcd(gcd(6,10),15)
            = gcd(2,15)
            = 1
            */
            g=gcd(g,nums[i]);
            if(g==1)return true;
        }
        return false;
    }

    static void main() {
        System.out.println(isGoodArray(new int[]{12,5,7,23})); // true
    }
}
