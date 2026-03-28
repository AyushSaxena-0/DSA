public class O151LCM_Of_Two_Numbers {
    //LCM*HCF=Product of two numbers
    //Works only on two numbers at a time
    static int hcf(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
    static int lcm(int a ,int b){
        //using hcf*lcm=product of two numbers
        return ((a*b)/hcf(a,b));//To protect from overflow
        //You can also use a/hcf(a,b)*b
    }

    public static void main(String[] args) {
        System.out.println(lcm(3,4));
    }
}
