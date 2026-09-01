package OOPS.Lecture_6.CompairingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student kunal=new Student(1,89.5f);
        Student rahul=new Student(2,99.5f);
        Student sara=new Student(3,90.5f);
        Student kiyo=new Student(4,57.5f);
        Student zatch=new Student(5,9.5f);
        //You earlier cannot do kunal>rahul as it has two parameters
        //Thus you are going to use implements comparable
        //I implemented Comparable interface in class Student
        //Also I override the a.compareTo(b) function to get required output
        if(kunal.compareTo(rahul)==0){
            System.out.println("Both have equal marks");
        }
        else if(kunal.compareTo(rahul)>0){
            System.out.println("Kunal has more marks");
        }
        else{
            System.out.println("Rahul has more marks");
        }
        Student[]arr=new Student[5];
        arr[0]=kunal;
        arr[1]=rahul;
        arr[2]=sara;
        arr[3]=kiyo;
        arr[4]=zatch;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,new Comparator<Student>() {
            @Override
            //Sorted according to roll number
            public int compare(Student o1, Student o2) {
                return (int)(o1.roll-o2.roll);
            }
        });
        //This can be replaced by lambda expressions like done below
        //Arrays.sort(arr, (o1, o2) -> (int)(o1.roll-o2.roll));
        // We cannot use > or < directly to compare Student objects.
        // Therefore, Student implements Comparable<Student>.
        // compareTo() defines how two Student objects should be compared.
        // Arrays.sort(arr) uses the compareTo() method of Student
        // to determine the natural ordering of the objects.
        //Also you can create a new Comparator<> method
    }
}
