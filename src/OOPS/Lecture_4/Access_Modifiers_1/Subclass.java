package OOPS.Lecture_4.Access_Modifiers_1;
//This class is withing the same package as parent A class
class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       Subclass obj=new Subclass(10,"Kunal");
        System.out.println(obj.pro);
        System.out.println(obj.pub);
        System.out.println(obj.def);

    }
}
