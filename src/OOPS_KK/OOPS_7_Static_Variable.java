package OOPS_KK;


public class OOPS_7_Static_Variable {
    static int a=10;
    static int b;

    static{
        //Static block is executed when the class is loaded in the memory
        //It is loaded first ,before any object is created before any block is executed before main function run
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        //So we do not need to create object
        OOPS_7_Static_Variable obj=new OOPS_7_Static_Variable();
        //System.out.println(obj.a+obj.b);
        //Even though obj.a works but it is technically wrong
        //As static variable is for all members of class
        //So use below syntax
        System.out.println(OOPS_7_Static_Variable.a+" "+OOPS_7_Static_Variable.b);
        //The static block ran only once
        //Even if I create a new object it won't run
        OOPS_7_Static_Variable obj2=new OOPS_7_Static_Variable();
        System.out.println(OOPS_7_Static_Variable.a);
        OOPS_7_Static_Variable.b+=100;
        System.out.println(OOPS_7_Static_Variable.b);
    }
}
