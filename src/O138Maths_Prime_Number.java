public class O138Maths_Prime_Number {
    //Prime number is a number that is not divisible by any number other than 1 and itself
    //Brute force check all numbers till the number starting from 2
    static boolean brute(int n){
        if(n<=1)return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //We check integers till sqrt(n) as after that factors repeat
    //for any number say 20 see the list of factors
    //
    //1   *   20    =   20
    //2   *   10    =   20
    //4   *   5     =   20
    //5   *   4     =   20
    //10  *   2     =   20
    //20  *   1     =   20
    // Check after the sqrt(n) the elements are repeated
    //So we use this trick
    static boolean optimum(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(brute(n));
        System.out.println(optimum(n));
    }

}
