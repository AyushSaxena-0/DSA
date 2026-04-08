package OOPS_KK;
class Test1{
    String a;

    Test1(String a){
        this.a=a;
    }
}
public class OOPS_8_InnerClass {
    //Only Inner class could be static
    //Not outer class
    class Test2{
        String name;
        public Test2(String name){
            this.name=name;
        }

        public static void main(String[] args) {
            //This would give error,But if i make class static it would work
            //Because static function would require only static variable
            //Non static class Test2 won't work it would give error
            //Test2 ab=new Test2("Kunal");
            //Below won't give error
            //As this is not a dependent class
            Test1 obj=new Test1("Kunal");
            System.out.println(obj.a);
        }
    }
}
