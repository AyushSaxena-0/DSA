import java.util.Arrays;

public class O31Function_Overloading {

    //Function overloading happens when two or more functions of same name exist
    //Arguments are of different type
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(float a, float b){
        System.out.println(a+b);
    }
    static void sum(double a,double b){
        System.out.println(a+b);
    }
    static void sum(String a,String b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }
    static void demo(int ...x){
        System.out.println(Arrays.toString(x));
    }
    static void demo(String ...x){
        System.out.println(Arrays.toString(x));
    }
    public static void main(String[] args) {
        sum(1,2);
        sum(1.1f,2.2f);
        sum(4.4444,5.7887);
        sum("A","B");
        sum(1,2,3,4);
        demo(1,2,3,4);
        demo("A","Y","U","S","H");
    }
}
