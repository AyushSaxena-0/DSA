package OOPS.Lecture_6.CompairingObjects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student kunal=new Student(1,89.5f);
        Student rahul=new Student(2,99.5f);
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
        Student[]arr=new Student[3];
        arr[0]=kunal;
        arr[1]=rahul;
        arr[2]=kunal;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // We cannot use > or < directly to compare Student objects.
        // Therefore, Student implements Comparable<Student>.
        // compareTo() defines how two Student objects should be compared.
        // Arrays.sort(arr) uses the compareTo() method of Student
        // to determine the natural ordering of the objects.
    }
}
