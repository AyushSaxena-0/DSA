package OOPS.Lecture_2.singletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        //Look all of them are pointing once
    }
}
