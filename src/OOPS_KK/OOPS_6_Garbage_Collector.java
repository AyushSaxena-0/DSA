package OOPS_KK;
class Bike{
    int cost;

    Bike(int cost){
        this.cost=cost;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object of class Bike is destroyed");
    }
}
public class OOPS_6_Garbage_Collector {
    //Garbage collector removes the garbage value in the heap
    //Like a points to 10 then a points to 20, so 10 is removed by garbage collector automatically
    //C++ have destructors for this but java does it automatically
    //Finalize method tells the java what to do when it does garbage collection automatically
    //Finalize is used to tell java what to do when it does garbage collection automatically
    public static void main(String[] args) {
        Bike b1=new Bike(100);
        for(int i=0;i<1000000000;i++){
            //when number of objects are large then old garbage values are deleted from memory
            b1=new Bike(i);
        }
    }
}
