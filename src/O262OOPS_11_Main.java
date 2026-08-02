public class O262OOPS_11_Main {
    public static void main(String[] args) {
        O261OOPS_10_Singleton obj= O261OOPS_10_Singleton.getInstance();
        O261OOPS_10_Singleton obj1= O261OOPS_10_Singleton.getInstance();
        O261OOPS_10_Singleton obj2= O261OOPS_10_Singleton.getInstance();
        O261OOPS_10_Singleton obj3= O261OOPS_10_Singleton.getInstance();
        //All point to same object
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
