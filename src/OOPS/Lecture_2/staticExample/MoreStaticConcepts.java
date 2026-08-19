package OOPS.Lecture_2.staticExample;

public class MoreStaticConcepts {
    public static void main(String[] args) {
        //calling non static method void greeting() won't work as non static method cannot be called iside static method
        //greeting is non static method
        //And main is static method
        //So you cannot call greeting inside main
        //Hence i make static void greeting();
        //Also non static methods are dependent on instance (object)
        //Thus we cannot use non static methods inside static methods
        greeting();
        fun3();
    }

    static void fun(){
        //greeting() be called only if greeting is static method
        //As fun is a static method so non static method cannot be called inside static method
        greeting();
        //Non-static methods are dependent on objects
    }
    static void greeting(){
        System.out.println("Hi! Ayush,How are you doing?");
    }
    void fun2(){
        System.out.println("I am a non static method");
        //greeting() is a static method but it is called inside non static function fun2()
        greeting();
    }
    static void fun3(){
        //If i want to use a non static method inside a static method
        //Then i need to create object of it
        MoreStaticConcepts obj1=new MoreStaticConcepts();
        obj1.fun2();
    }
}
