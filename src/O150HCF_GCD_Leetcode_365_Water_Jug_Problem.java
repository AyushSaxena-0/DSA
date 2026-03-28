public class O150HCF_GCD_Leetcode_365_Water_Jug_Problem {
    //HCF highest Common factor
    //GCD greatest Common Divisor
    //The smallest positive value of
    //in    ax+by
    // is HCF(a,b) with integral value of x and y
    //Thus keep this in mind
    //HCF(4,8)=4
    //HCF(4,18)=2
    //HCF(3,9)=3

    //If HCF of two numbers is one , then both are said to be coprime

    //Euclidean Algorithm is used in maths to find hcf
    //It states that HCF(a,b)=HCF(b,a%b)
    //Stop when a%b=0 then b becomes the HCF

    //Also if the target variable is divisible by hcf then the target is achievable
    //Otherwise it is not achievable
    //ax+by=c
    //then if the minimum value or hcf is not a divisor of c then the target is not achievable
    //Also if both containers sum value is less than target then it can't be achieved
    //As it can at max be the sum of both


    public static int hcf(int a,int b){
        //Using Eucledean Theorem
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static boolean canMeasureWater(int x, int y, int target) {
        int h=hcf(x,y);
        //If collective value of both the conditions were smaller than target
        //Then the target is unachievable
        //Otherwise achievable
        if(target>x+y)return false;
        if(target%h==0)return true;
        return false;
    }

    public static void main(String[] args) {
        int x=3;
        int y=5;
        int target=4;
        System.out.println(canMeasureWater(x,y,target));
    }

}
