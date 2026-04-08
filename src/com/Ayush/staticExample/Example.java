package com.Ayush.staticExample;

public class Example {
    public static void main(String[] args) {
        Human Ayush=new Human(24,"Ayush",20000,true);
        Human Ram=new Human(32,"Ram",30000,true);
        //The variable Ayush.population should be static because it is command for all the objects
        //As all civilians have same total population of country
        //You can use Ayush.population,Ram.population but it is preferred to use ClassName.StaticVariable
        //So we use Human.population
        System.out.println(Human.population);
        //Static variables could be used even without using objects
        //Main is the first thing to run so we call it static
        //Any non static method cannot be called inside static method
        example();
    }
    static void example(){
        //A non static method cannot be called inside a static method
        //As static objects should be used without creating object

        //So we need to create an object in order to use non static function inside the static method
        //An object of main class would be required

         Example obj=new Example();
         obj.greeting();
    }
    void greeting(){
        System.out.println("I am called from a non static method");
    }
}
