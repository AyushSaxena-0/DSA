package OOPS.Lecture_5_Part_2.Interface;
// Interfaces are used to achieve abstraction and support multiple inheritance of type.
//
// An interface is declared using the interface keyword.
//
// Interfaces cannot be directly instantiated.
// Example: Engine e = new Engine(); // ❌
//
// A class can implement multiple interfaces.
// Example: class Car implements Engine, Brake
//
// Interface fields are implicitly public static final.
//
// Interfaces can contain:
// 1. Abstract methods
// 2. Default methods (Java 8+)
// 3. Static methods
// 4. Private methods (Java 9+)
//
// A class can extend only ONE class,
// but can implement MULTIPLE interfaces.
//
// An abstract class can have instance variables,
// including non-final variables.
//
// Interfaces cannot extend classes.
// Interfaces can extend other interfaces.
//
// A reference can have an interface type:
// Engine e = new Car();
//
// What members can be accessed through a reference
// depends on the reference type.
//
// If multiple interfaces have methods with the same signature,
// the implementing class provides one implementation for that signature.
//
// For different responsibilities such as Engine, Brake and Media,
// composition/delegation can often provide a cleaner design.
public class Main {
    //We use java interfaces for solving multiple inheritance problem
    //They are .java files but called Interfaces
    //They contain static and non-static abstract methods
    //Interfaces contain final static variables
    //Interfaces cannot have an object
    //Hence no instance variable
    //You can implement multiple interfaces together
    //As there is no issue of object creation thus the conflict
    //of which class's function to inherit is no longer a problem
    //From java 8 it can have the default methods also
    //Abstract classes may contain non-final arguments
    //But interface can't
    //Abstract class can provide implementation of an interface
    //But interface cannot provide implementation of an abstract class
    //A class can implement multiple interfaces but not Superclasses
    //Note interfaces have an overhead hence you should not use it at places which are performance critical
    public static void main(String[] args) {
        Car lamborgini = new Car();
        //Engine lamborgini=new Car();
        //Brake lamborgini=new Car(); Both are valid ways of declaration
        //However if there is a variable "a" in class Car you won't be able to access it as what variables you can access depends upon the reference variable type which is Engine and Brake in this case
        //Car car can access "a" if there would be a variable in class A named as "a"
        lamborgini.brake();
        lamborgini.start();
        lamborgini.stop();
        lamborgini.acc();

        Car mediaCar = new Car();
        //But note I wanted to stop the media but it stopped the car hence this is the problem
        //Both the stop() method have same name in different interfaces so this overriding override both
        //To fix this we need to create the separate class of media
        mediaCar.stop();
        //Check Nice car class
        //Create diffrent classes
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
