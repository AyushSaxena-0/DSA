public class O306Leetcode_3622_Check_Divisibility_by_Digit_Sum_And_Product {
    public static boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int x=n;
        while(x>0){
            int unit=x%10;
            prod=prod*unit;
            sum=sum+unit;
            x=x/10;
        }
        return n%(sum+prod)==0;
    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
}
