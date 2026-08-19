package OOPS.Lecture_2.staticExample;
//Outside classes cannot be static
public class InnerClasses {
    //Only inner classes can be static
    static class Test{
    //Static inner class
        //As Non-static inner classes are dependent on outclass object
    }
    class A{
        //Non static inner class
    }
}
