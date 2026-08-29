package OOPS.Lecture_5_Part_2.Interface.extendDemo;

public interface B extends A{
    void greet();
    static void fun5(){
        System.out.println("I am from fun 5 in Interface B");
        System.out.println("static method cannot be overridden so we need to create their body in function");
    }
}
