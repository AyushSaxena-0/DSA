package OOPS.Lecture_4.Packages;
//This class is in different package as parent class so default constructor won't work
import OOPS.Lecture_4.Access_Modifiers.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(10,"Kunal");
        System.out.println(obj.pro);
        System.out.println(obj.pub);
        //System.out.println(obj.def);  Default access specifier won't work
    }
}
