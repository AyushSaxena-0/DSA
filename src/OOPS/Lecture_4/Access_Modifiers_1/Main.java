package OOPS.Lecture_4.Access_Modifiers_1;

public class Main {
    //Private means only in that class
    //Public means everywhere
    //Default(When you don't specify any access modifier)
    //Protected could be inherited in child class outside the package also
    public static void main(String[] args) {
        A obj=new A(10,"Kunal");
        //So i need to do a few things like :-
        //1) Access the data members
        //2) Modify the data members
        // System.out.println(obj.num); Won't work as num is declared private and you cannot access it directly
        //Use getter and setter method
        System.out.println(obj.getNum());//This would work as getter method is public
    }
}
