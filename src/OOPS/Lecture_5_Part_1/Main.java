package OOPS.Lecture_5_Part_1;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(22);
        Parent daughter=new Daughter(16);//Daughter daughter=new Daughter(16) would also work
        son.carrer();
        daughter.carrer();
        System.out.println("Son's age "+son.age);
        System.out.println("Daughter's age "+daughter.age);
        Parent.greeting();//Parent class is abstract and hence object cannot be created
        //Thus we cannot create object of it
        //But static methods could be present in abstract class along with least one abstract method
    }
}
