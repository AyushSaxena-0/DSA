public class O132Find_Set_Bits {
    static int setBits(int n){
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
    //Alter keep doing n - [n & (-n)] {[n & (-n)]It is used to find the rightmost set bit}
    //count number of iteration
    //Alter use Integer.bitCount(n) to count the number of set bits

    public static void main(String[] args) {
        System.out.println(setBits(6));
    }
}
