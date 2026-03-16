public class O128Find_If_Power_Of_2_Or_Not {
    //Brute force count number of 1 and rightshift till till n>0
    //If number of 1's are more than one then it is not power of 2
    //Alter N & (N-1) ==0 then number is power of 2 otherwise not
    static boolean brute(int n){
        int count =0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        return (count==1);
    }
    static boolean optimal(int n){
        if (n==0) return false;//0 & -1==0 so we take care of exceptional case
        return (n & (n-1))==0;
    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(brute(n));
        System.out.println(optimal(n));
    }
}
