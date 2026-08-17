package OOPS.Lecture_1;

    class A {
    String name;
        A(String name){
        this.name=name;
    }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object Destroyed");
        }
    }
public class GarbageCollection {
    //In java garbage collection is automatic
    //So what you can do is tell java to do when garbage collection happens
    public static void main(String[] args) {
        A obj1;
        for(int i=0;i<100000000;i++){
            obj1=new A("Ram");
        }
    }
}
