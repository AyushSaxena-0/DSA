package OOPS.Lecture_3_Part_2;
//Encapsulation done by access modifiers
public class Main {

    private double l;

    Main(double l){
        this.l=l;
    }
    //To access private variable l outside class you can use public getL method to access ut outside this class
    public double getL(){
        return l;
    }
    public void setL(double l){
        this.l=l;
    }
}
