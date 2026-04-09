package OOPS_KK;

public class OOPS_10_Singleton {
    private OOPS_10_Singleton(){}
    private static OOPS_10_Singleton instance;
    public static OOPS_10_Singleton getInstance(){
        if(instance==null){
            //Check whether one object is created or not
            //If not create new
            instance=new OOPS_10_Singleton();
        }
        //Otherwise return old
        return instance;
    }
}
