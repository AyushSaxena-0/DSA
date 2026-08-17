package OOPS.com.Ayush.introduction;

public class Main {
    public static void main(String[] args) {
        //Store 5 roll numbers
        int[]roll=new int[5];
        //Store 5 Names
        String[]names=new String[5];
        //Data of 5 students {rno,name,marks}
        int[]rno=new int[5];
        String[]name=new String[5];
        int[] marks=new int[5];
        //But if we want a data structure which contains all three information
        //Then we use OOPS to create new data structures according to our needs
        //A class is a named group of properties and function
        //A class is a blueprint that defines the data field and behavior of methods
        Student ayush;//This is ayush pointing to null
        //ayush is declared and is in stack but points to null
        //             new int new Student() allots memory dynamically during the run time
        ayush=new Student(1,"Ayush", 96.6F);
        System.out.println(ayush.roll+" "+ayush.name+ " "+ayush.marks);
    }
}
    class Student{
    int roll;
    String name;
    float marks;

    Student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
}