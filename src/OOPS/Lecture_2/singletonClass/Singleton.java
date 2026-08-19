package OOPS.Lecture_2.singletonClass;

public class Singleton {
    //Whatever thing is private can be called only in the class it is declared
    private Singleton(){
        System.out.println("Hello I am from Singleton class");
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //Check weather one object is already created or not
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
