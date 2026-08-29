package OOPS.Lecture_5_Part_2.Nested_Interfaces;
//Nested interfaces are interfaces inside a class
//Nested interfaces could be public private or default
//But top level interface should be public only
public class Nested {
    //Interface inside a class
    public interface Nested_Interface {
        boolean isOdd(int num);
    }
}
class B implements Nested.Nested_Interface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
class Main{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(1));
    }
}