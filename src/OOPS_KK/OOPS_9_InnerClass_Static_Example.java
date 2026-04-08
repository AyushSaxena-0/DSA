package OOPS_KK;

public class OOPS_9_InnerClass_Static_Example {
    public static class InnerClass5{
        String s;
        InnerClass5(String s){
            this.s=s;
        }
    }

    public static void main(String[] args) {
    InnerClass5 a=new InnerClass5("Ayush");
        System.out.println(a.s);
    }
}
