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
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    //Cube
    public Box(int length) {
        this.length = length;
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
        System.out.println("The information function is running");
    }
}
