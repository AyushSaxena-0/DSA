package OOPS_KK;

public class OOPS_4_FinalKeyWord {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void swap2(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        //It won't swap as a and b are primitive integers
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        //Now trying Integer wrapper class
        Integer x=10;
        Integer y=20;
        //Swap doesn't work
        swap2(x,y);
        //Because Integer is final
        System.out.println(x);
        System.out.println(y);
    }
}
