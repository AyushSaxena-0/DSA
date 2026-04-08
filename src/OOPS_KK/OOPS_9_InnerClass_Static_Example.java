package OOPS_KK;

public class OOPS_9_InnerClass_Static_Example {
    //Static InnerClass5 is not dependent on OOPS_9_InnerClass_Static_Example
    //So you can create objects of InnerClass5 without its dependency on outerclass
    public static class InnerClass5{
        String s;
        InnerClass5(String s){
            this.s=s;
        }
    }

    public static void main(String[] args) {
    InnerClass5 a=new InnerClass5("Ayush");
    InnerClass5 b=new InnerClass5("Kunal");
    System.out.println(a.s);
    System.out.println(b.s);
    }
}
