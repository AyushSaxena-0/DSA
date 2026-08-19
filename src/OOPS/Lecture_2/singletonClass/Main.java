package OOPS.Lecture_2.singletonClass;

public class Main {
    public static void main(String[] args) {
        //Basically you have a public class and a private constructor
        //You have a static method to get instance
        //you have a static class type variable inside the public singleton class
        //You can only access private methods in that class only so you call the constructor in getinstance
        //if object doesn't exist you create one and if it does
        //Don't create return the instance
        //Its nothing special
        //Just a definition
        //Dont worry at all!
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        //Look all of them are pointing once
    }
}
