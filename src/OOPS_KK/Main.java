package OOPS_KK;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        //All point to same object
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
