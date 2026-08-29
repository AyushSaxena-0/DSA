package OOPS.Lecture_5_Part_2.Interface.extendDemo;

public class Annotations implements A{
    @Override
    public void fun() {
        System.out.println("I am in Annotations class");
    }
    //Annotations are internally interfaces
    //Annotations can tell java/tools to perform certain checks or behaviors
    //Override:- Checks that a method is overriding a parent method
    //Depricated:- Marks something as old or not recommended
    //SupressWarnings:- Tells compiler to suppress certain warnings
    //Functional Interface:- Ensures an interface has only one abstract method

}
