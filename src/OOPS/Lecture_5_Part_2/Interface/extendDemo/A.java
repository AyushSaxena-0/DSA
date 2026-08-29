package OOPS.Lecture_5_Part_2.Interface.extendDemo;

public interface A {
    void fun();
    default void greeting(){
        System.out.println("Default method implemented in Interface");
    }
}
