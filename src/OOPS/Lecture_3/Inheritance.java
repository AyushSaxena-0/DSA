package OOPS.Lecture_3;

public class Inheritance {
    //Inheritance is child class using properties of base class
    //Private members of the parent class are not accessed by the child class
    public static void main(String[] args) {
//        Box box1 =new Box(10,10,10);
//        Box box2=new Box(box1);
//        System.out.println(box2.length+" "+ box2.width+" "+ box2.height);
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
        BoxPrice box=new BoxPrice(5,8,200);
    }

}
