public class O125Magic_Number_Amazon {
    static int ans(int num){
        double magic=0;
        //Alter use while loop and use right shift then take and with one
        //ans=0
        //While(n>0)
        //base=5
        //last=num & 1
        //n=num>>1
        //ans=+=last*base
        //base=base*5
        // after every iteration
        for(int i=0;i<32;i++){
            if ((num & (1<<i))!=0){
                magic=magic+Math.pow(5,i+1);//i+1 due to we start from 5^1 not 5^0
            }
        }
        return(int) magic;
    }

    public static void main(String[] args) {
        int nums=6;
        System.out.println(ans(nums));
    }
}
