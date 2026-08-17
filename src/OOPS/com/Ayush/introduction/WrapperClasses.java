package OOPS.com.Ayush.introduction;

public class WrapperClasses {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        //Won't work with primitives
    }
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
        //Still won't work
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Integer c=new Integer(10);
        Integer d=new Integer(20);
        //Observe Integer class has much more methods than primitive int
        swap(a,b);
        System.out.println(a+" "+b);
        //Wrapper class also would not be swapped...But why???
        System.out.println(c+" "+d);
        //Because it is a Final class (ctrl+click Integer)
        //Thus it cannot be modified
        //Convention is writing final variable with all capital letters
        final int BONUS=1000;
        //Won't work as final is used and int is primitive
        //But using final variable on object doesn't guarantee it won't change
        final Student obj1=new Student();
        obj1.changeName("Ankit"); //would change the name
        System.out.println(obj1.name);//Look output is Ankit
        //BONUS=300;
        //Final variables have to be initialized as they cannot be modified later
        //But you cannot reassign
        //Like you cannot do something like
        //obj1=new Student(1,"Ayush,6);
    }
}
