package OOPS_KK;
//Class which is public is used to keep java file name
    class Student{
    int rno;
    String name;
    int marks;
}

public class OOPS_2_Class {
    //Class is a logical construct
    //Object is a physical reality
    //Like car is a logic
    //Audi,Ferrari,Maruti is reality

    //Objects are stored in heap memory
    //Reference variables are stored in stack
    public static void main(String[] args) {

        Student std1=new Student();
        //All three are instance variable here
        std1.name="Ayush";//Variable inside the object is known as instance variable
        std1.marks=99;
        std1.rno=1;

        Student std2=new Student();
        std2.name="Ram";
        std2.marks=67;
        std2.rno=2;
        //LHS is declaration RHS is allocation of dynamic memory
        Student std3=new Student();
        std3.name="Shreya";
        std3.marks=90;
        std3.rno=3;
    //For objects that are not initialized the default value is null
    //For primitives the value is 0 and for boolean it is false, and for char is a null character
        System.out.println(std1.rno+" "+std1.name+" "+std1.marks);
        System.out.println(std2.rno+" "+std2.name+" "+std2.marks);
        System.out.println(std3.rno+" "+std3.name+" "+std3.marks);
    }
}
