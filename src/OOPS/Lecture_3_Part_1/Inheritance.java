package OOPS.Lecture_3_Part_1;

public class Inheritance {
    //Inheritance is child class using properties of base class
    //Private members of the parent class are not accessed by the child class
    //Multi level inheritance is when parent of child class is itself child of another class
    //Multiple Inheritance one class is child to more than one parent class
    //Multiple Inheritance is not supported in Java
    //If one variable is in both the parent class then if object of child calls that variable then what would be the output ?This is the reason why java does not support multiple inheritance
    //We would deal with this in Interfaces
    //Hierarchical Interface One parent can have multiple parents like in a hierarchical tree of family
    //Hybrid Inheritance Combination of single and multiple inheritance
    //Not in java check Interfaces module/Lecture
    public static void main(String[] args) {
        //Box box1 =new Box(10,10,10);
        //Box box2=new Box(box1);
        //System.out.println(box2.length+" "+ box2.width+" "+ box2.height);
        BoxWeight bw = new BoxWeight(1,2,3,4);
        System.out.println(bw.height+"   "+bw.length+"  "+"  "+bw.width+"   "+bw.weight);
        //Look BoxWeight inherited the properties,variables and functions of parent Box class
        bw.information();
        //nonAccessable variable cannot be accessed here outside its own class
        //So "System.out.println(bw.nonAccessable);" this would give error
        //Also observe that Box5 is of type Box and not BoxWeight() even though it looks like that
        Box box5=new BoxWeight(1,2,3,5);
        //The below line won't work as parent cannot use child variables
        //System.out.println(box5.weight);
        //You can only use variables and methods like box5.length,box5.width,box5.height
        //Also you cannot do like below
        //BoxWeight box2=new Box(length,breadth,height);
        //This is because you would then try to access weight but that is not possible
        //The object that you are referencing to in the heap memory does not contain weight in it
        //So this won't work and give error
        //Referance variable is in stack and object is in heap memory
        //Box pointing to BoxWeight in heap memory would work as all the variables of Box are available in BoxWeight
        //Observe that parent class constructor is called first as child is dependent on parent class
        //So parent class constructor is called first
        //Then child class constructor is called
        //Also a class cannot inherit itself i.e. no cyclic inheritance
        BoxPrice box=new BoxPrice(5,8,200);
        B obj1=new B();
        A obj2=new A();
        //Look both of these posseses int a variable of parent class A
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }

}
