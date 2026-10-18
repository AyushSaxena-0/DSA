package OOPS.Lecture_3_Part_1;

public class Box {
    //Private members of parent class cannot be inherited by child class
    private int nonAccessable=10;

    int length;
    int width;
    int height;

    //For Empty
    public Box() {
        //super(); Object class
        //Super is used to call the parent class constructor
        //Super cannot call the constructor in the same class
        //this(-1,-1,-1); is a constructor that calls the parameterized constructor
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    //Cube
    public Box(int length) {
        this.length=length;
        this.height=length;
        this.width=length;
    }
    //Cuboid
    public Box(int length,int width,int height){
        System.out.println("Parent class Constructor");
        this.length=length;
        this.width=width;
        this.height=height;
    }
    //Copy constructor
    public Box(Box box){
        this.length=box.length;
        this.width=box.width;
        this.height=box.height;
    }
    public void information(){
        System.out.println("The information function is running of Box class");
    }
}
