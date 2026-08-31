package OOPS.Lecture_6.CompairingObjects;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        //This function determines how Arrays.sort(arr) would work on array of object type student
        int dif=(int)(this.marks-o.marks);
        //0 if equal
        //>0 if this.marks is greater
        //<0 if this.marks is smaller
        return dif;
    }

    @Override
    public String toString() {
        return "["+roll+","+marks+"]";
    }
}
