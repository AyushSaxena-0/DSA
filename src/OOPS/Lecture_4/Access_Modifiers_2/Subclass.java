package OOPS.Lecture_4.Access_Modifiers_2;
//This class is in different package as parent class so default constructor won't work
import OOPS.Lecture_4.Access_Modifiers_1.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(10,"Kunal");
        System.out.println(obj.pro);
        System.out.println(obj.pub);
        //System.out.println(obj.def);  Default access specifier won't work
        //instanceof is used to check weather an object is instance of class
        System.out.println(obj instanceof A);//true
        System.out.println(obj instanceof Subclass);//true
    }
}
