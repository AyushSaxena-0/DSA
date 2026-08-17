package OOPS.Lecture_1;

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
        ayush.greeting();
        ayush.changeName("TechLover");
        ayush.greeting();
        //Default constructor is used
        Student ram=new Student();
        ram.studentInfo();
        //Now i want you to observe something
        Student s1=new Student(1,"s1",100);
        Student s2=s1;
        //This gives output name s1 as they point to same object in heap memory
        s2.studentInfo();
        //Now lets change s2
        s2.changeName("Changed Name by S2");
        //Observe change in s2 made change in s1 also because they point to same object in heap memory
        s1.studentInfo();
        //Hence create a copy constructor always to create a copy of objects
    }
}
    class Student{

        int roll;
        String name;
        float marks;
        //Constructors do not have a return type
    Student(Student s){
        //This is used for copying one object and creating new object
        //This also known as copy constructor
        roll=s.roll;
        name=s.name;
        marks=s.marks;
    }
//    Student(){
//            //This is constructor overloading
//            //By default when no parameter is passed then this runs on object creation
//            roll=0;
//            name="Default";
//            marks=0;
//        }
        Student(){
        //One constructor calling another constructor
            this(0,"Default",0);
        }
    Student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    void greeting(){
        System.out.println("Hello!,My name is "+this.name);
    }
    void changeName(String newName){
        this.name=newName;//You can also use name here
    }
    void studentInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Marks: "+this.marks);
        System.out.println("Roll: "+this.roll);
    }
}