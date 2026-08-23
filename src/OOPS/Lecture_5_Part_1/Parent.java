package OOPS.Lecture_5_Part_1;
//Still abstract classes do not support multiple inheritance
//As abstract class also may have normal methods then two classes of same method inherited by child
//There would be confusion by child for which parent normal method to inherit if they have same name
//We would need Interface for that
public abstract class Parent {
    //We cannot have a final abstract class as final keyword prevents from inheritance
    //Without inheritance how would we override methods
    //Hence no sense of final abstract class
    int age;
    final int VALUE;
    //We can create a constructor of an abstract class
    //But it can be called by super() method in child class
    //You cannot use this constructor to create object of abstract class as object creation of abstract class is not allowed
    //Note abstract methods cannot be static as abstract methods need object for their implementation
    //And static methods are not dependent on object hence no logic of creating static abstract methods

    public Parent() {
        this.age=age;
        VALUE=100;
    }
    abstract void carrer();
    abstract void partner();
    static void greeting(){
        System.out.println("I am a static method in abstract class");
    }
    void normal(){
        System.out.println("This is a normal method in abstract class");
    }
}
