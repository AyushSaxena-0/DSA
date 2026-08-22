package OOPS.Lecture_4.Packages;

import OOPS.Lecture_4.Access_Modifiers.A;

public class DiffPackageNoSubClass {
    public DiffPackageNoSubClass() {

    }

    public static void main(String[] args) {
        A obj = new A(25,"Kunal");
        //System.out.println(obj.pro); diffrent package and not subclass than protected won't work
        System.out.println(obj.pub);//Only public will work
        //System.out.println(obj.def);

    }
}
