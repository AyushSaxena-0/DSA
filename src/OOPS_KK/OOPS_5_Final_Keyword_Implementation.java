package OOPS_KK;

public class OOPS_5_Final_Keyword_Implementation {
    //By convention final variable is written in capital letters
    static final int A=256;

    public static void main(String[] args) {
        System.out.println(A);
        //This won't work as a is final variable
        //a=a+1;
        //System.out.println(A);
    }
}
