package OOPS.Lecture_2.staticExample;

import static OOPS.Lecture_2.staticExample.Human.*;

public class Main {
    public static void main(String[] args) {
        //A static variable could be called without even creating an object of that class
        Human A=new Human(23,165);
        Human B=new Human(23,165);
        Human C=new Human(45,173);
        System.out.println(A.age);
        System.out.println(B.age);
        System.out.println(A.height);
        System.out.println(B.height);
        //Static variables are independent of objects
        //All humans have 2 legs and 2 hands
        System.out.println(hands);
        System.out.println(legs);
        System.out.println(population);
        //Since population is a global variable A.population would also work but not recommended
        System.out.println(A.population);
        //This is recommended ClassName.StaticVariableName
        System.out.println(Human.population);
    }
    // Very Very Important question
    //Why is main function static?
    //main function is static as otherwise we would need to create an object of main function
    //But how can we even create an object as main is itself running first
    //So main is first function to run then how can object of main can be created
    //Thus main is taken as a static function and hence public static void main(String[]args) has static in it

}
