package OOPS.Lecture_3;

public class BoxWeight extends Box{
    int weight;
    public BoxWeight(int weight){
        this.weight=weight;
    }
    public BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(BoxWeight bw){
        this.weight=bw.weight;
    }
    public BoxWeight(int length,int width,int height,int weight){
//        this.length=length;
//        this.width=width;
//        this.height=height;
        //Alter use super(l,w,h)
        //Super is parent class constructor
        //Super also stands for superclass constructor
        super(length,width,height);//Calling the parent class constructor
        System.out.println("Child Class Constructor");
        this.weight=weight;
    }
    public void sample(){
        //You can use super keyword super.variableName to access variable in parent class
        System.out.println(this.height);
        System.out.println(super.height);
        //Both this.height and super.height are valid
        //Also if you have height variable in both the parent and child class then you can
        //use super.height to call the value of height variable in parent class variable value
        //use this.height to call the value of height variable in child class
    }
}
