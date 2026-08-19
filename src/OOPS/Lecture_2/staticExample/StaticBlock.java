package OOPS.Lecture_2.staticExample;
public class StaticBlock {
    static int a=4;
    static int b;

    //How to initialize this static variable
    //This static block will run once
    static {
        System.out.println("I am a static block");
        b=a*5;
    }

    public static void main(String[] args) {
        //I am going to show through this example that the static block runs only once
        //It is not dependent on object
        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        //Look the static block only ran once as there is no output as "I am static block" again
        //It was printed only once when the class is loaded
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
