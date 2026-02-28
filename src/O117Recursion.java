public class O117Recursion {
    //Recursion is most important topic in entire DSA
    //Look at the flow of program using debug pointer
    //One function calls another function
    //At the end function ends and control goes to the caller function

    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        message();
    }
}
