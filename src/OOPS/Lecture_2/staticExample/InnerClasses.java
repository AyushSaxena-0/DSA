package OOPS.Lecture_2.staticExample;
//Outside classes cannot be static
public class InnerClasses {
    //Only inner classes can be static
    static class Test{
    //Static inner class
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    class A{
        //Non static inner class
        //As Non-static inner classes are dependent on outclass object
        //So they are dependent
        String name;

        public A(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //You cannot do something like
        Test obj1=new Test("Ayush");
        Test obj2=new Test("Bob");
        //What would be the output?As both of them are static !
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        //You cannot do this
        //As this class is dependent on parent class Test
        //A obj=new A("Ram");
        //So you cannot use non static function inside a static method
    }
}
