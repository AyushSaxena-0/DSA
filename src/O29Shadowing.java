public class O29Shadowing {
    //Static is used to make it use without object
    //integer x is declared and has scope inside the bracket of class
    static int x=19;

    static void fun(){
        //x is not initialised , it is assigned a value
        System.out.println(x);
        //Shadowing is assigning the value of x again and initialising it
        //so x shadows above value and gets updated with new value
        int x=999;
        System.out.println(x);
        //Look x value originally 456 is shadowed and updated to 999
    }
    public static void main(String[] args) {
        System.out.println(x);
        //x is not initialised and reassigned another value
        x=100;
        System.out.println(x);
        fun();
    }
}
