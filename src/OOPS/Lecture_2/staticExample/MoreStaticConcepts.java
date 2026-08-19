package OOPS.Lecture_2.staticExample;

public class MoreStaticConcepts {

    static void greeting(){
        System.out.println("Hi! Ayush,How are you doing?");
    }

    static void fun1(){
        //greeting() can be called directly because greeting is a static method
        //As fun1 is a static method, a non static method cannot be called directly inside a static method
        greeting();
        //Non-static methods are dependent on objects
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

    void fun4(){
        //Non static method can be called inside non static method
        fun2();
    }

    public static void main(String[] args) {
        //Calling a non static method directly won't work because a non static method cannot be called directly inside a static method
        //greeting is static
        //And main is static method
        //So we can directly call greeting inside main
        //If greeting were non static, then we would need to create an object to call it from main
        //Also non static methods are dependent on instance (object)
        //Thus we cannot directly use non static methods inside static methods without an object
        greeting();
        fun3();
    }
}
