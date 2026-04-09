package OOPS_KK;

public class OOPS_11_Main {
    public static void main(String[] args) {
        OOPS_10_Singleton obj= OOPS_10_Singleton.getInstance();
        OOPS_10_Singleton obj1= OOPS_10_Singleton.getInstance();
        OOPS_10_Singleton obj2= OOPS_10_Singleton.getInstance();
        OOPS_10_Singleton obj3= OOPS_10_Singleton.getInstance();
        //All point to same object
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
