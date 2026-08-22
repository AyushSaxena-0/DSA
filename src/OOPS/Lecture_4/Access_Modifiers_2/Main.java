package OOPS.Lecture_4.Access_Modifiers_2;

import OOPS.Lecture_4.Access_Modifiers_1.A;

public class Main {
    public static void main(String[] args) {
        A a = new A(10, "Kunal");
        //System.out.println(a.y); Won't work as y access type is default
        //default access is limited within same package and folder
        //So outside the package of class it is not accessible
        //variable with Default access variable could be inherited by one class and be used but only withing the same package

    }
}
