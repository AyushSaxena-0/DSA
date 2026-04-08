package OOPS_KK;

public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            //Check whether one object is created or not
            //If not create new
            instance=new Singleton();
        }
        //Otherwise return old
        return instance;
    }
}
