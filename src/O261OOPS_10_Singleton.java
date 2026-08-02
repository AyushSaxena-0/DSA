public class O261OOPS_10_Singleton {
    private O261OOPS_10_Singleton(){}
    private static O261OOPS_10_Singleton instance;
    public static O261OOPS_10_Singleton getInstance(){
        if(instance==null){
            //Check whether one object is created or not
            //If not create new
            instance=new O261OOPS_10_Singleton();
        }
        //Otherwise return old
        return instance;
    }
}
