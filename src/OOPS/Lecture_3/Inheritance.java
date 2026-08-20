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
    }

}
