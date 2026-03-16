public class O129Calculate_a_with_power_of_b {
    public static int brute(int base,int power){
        int ans=1;
        for(int i=1;i<=power;i++){
            ans=ans*base;
        }
        return ans;
    }
    public static int optimal(int base,int power){
        //In this approach we are squaring the base each time to reduce the number of times we do multiply
        //whether you do 1*1 or 198765456*12345432 for computer it is similar
        //As computer can do large calculations
        //So we break the base in powers of two
        // 3^6=3^(2+4)
        //Calculate 3^2 then square it to get 3^4 multiply both to get answer
        //Normal brute force time complexity
        //  O(N)
        //  Optimal approach time complexity
        //  O(LogN)

        int ans=1;
        while(power>0){
            //Check unit digit
            if((power&1)==1){
                ans=ans*base;
            }
            power=power>>1;//Shifting to right side

            base=base*base; //Squaring the base
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(optimal(6,10));
        System.out.println(brute(6,10));
    }
}
