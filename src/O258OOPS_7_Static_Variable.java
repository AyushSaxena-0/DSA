public class O258OOPS_7_Static_Variable {
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
        O258OOPS_7_Static_Variable obj=new O258OOPS_7_Static_Variable();
        //System.out.println(obj.a+obj.b);
        //Even though obj.a works but it is technically wrong
        //As static variable is for all members of class
        //So use below syntax
        System.out.println(O258OOPS_7_Static_Variable.a+" "+ O258OOPS_7_Static_Variable.b);
        //The static block ran only once
        //Even if I create a new object it won't run
        O258OOPS_7_Static_Variable obj2=new O258OOPS_7_Static_Variable();
        System.out.println(O258OOPS_7_Static_Variable.a);
        O258OOPS_7_Static_Variable.b+=100;
        System.out.println(O258OOPS_7_Static_Variable.b);
    }
}
