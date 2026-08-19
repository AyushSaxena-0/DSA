package OOPS.Lecture_2.staticExample;

public class Human {
    int age;
    int height;
    static int hands=2;
    static int legs=2;
    //Static variables are common to all object of its class
    static int population;

   static void message(){
       System.out.println("Hello World");
       //You cannot use this.height variable inside it as it is a static method
       //Independent of object
       //So object dependent variable cannot be used here
       //You can use static variables Human.population
       System.out.println("The population of Humans is "+Human.population);
   }

    //Press Alt+Insert to create and select all by clicking Ctrl+A to automatically create constructor
    public Human(int age, int height) {
        this.age = age;
        this.height = height;
        //Note if you had made it non-static then it would not have worked
        //Class.staticVariableName
        //You can also use population only that would work too
        Human.population=Human.population+1;
    }
    //Note you can declare functions() and variables as static inside a class
}
