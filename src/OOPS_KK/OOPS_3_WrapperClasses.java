package OOPS_KK;
class Students {
    int rno;
    String name;
    int rank;

    Students(int rno, String name, int rank) {
        this.rno = rno;
        this.name = name;
        this.rank = rank;
    }
}
public class OOPS_3_WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        //Here a is primitive
        //Not many functions are defined here
        //So we created wrapper classes
        //for our ease
        Integer num = 45;
        //num has so many methods as compared to 'a'

        //Observe
        Students ayush=new Students(1,"Ayush",10);
        Students ram=ayush;

        //They point to same memory in heap
        //changing ayush name would change ram name in heap
        ayush.name="LLol";
        System.out.println(ram.name);
    }
}
