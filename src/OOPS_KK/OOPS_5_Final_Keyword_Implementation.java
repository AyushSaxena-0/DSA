package OOPS_KK;

class Car{
    String name;
    int cost;

    Car(String name,int cost){
        this.name=name;
        this.cost=cost;
    }
    Car(Car car){
        this.name=car.name;
        this.cost=car.cost;
    }
}

public class OOPS_5_Final_Keyword_Implementation {
    //By convention final variable is written in capital letters
    static final int A=256;
    //Final variable only guarantees that instance variable would always point to same object
    //Always initialize the variable during declaration
    //Final keyword immutability works only with primitive datatypes that you cannot change their value
    //However objects with final could be changed
    //Instance variable would always point to the same object
    //But the value of the object could change

    public static void main(String[] args) {
        System.out.println(A);
        //This won't work as a is final variable
        //a=a+1;
        //System.out.println(A);
        final Car car1=new Car("Car1",100000);
        car1.cost=1;
        //Look even though the reference variable was of type final
        //We could modify the value
        //The variable points to same object but the value was changed of the object
        //But you cannot do Car car1=car3 as car1 is final
        System.out.println(car1.cost);
        Car car2=new Car("Car2",100000);
        //car1 is a final object
        //car1 cannot be assigned to car2
        //car1=car2;
    }
}
