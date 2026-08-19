package OOPS.Lecture_2.b;
//import statement is used to use functions of other classes in other class
import OOPS.Lecture_2.a.Trial;

import OOPS.Lecture_2.a.Trial;
public class Packages {
    public static void main(String[] args) {
        System.out.println("I am second class with same name");
        //Note it can run as it is in another package
        //I am going to use arraySum() function from Trial class in OOPS.Lecture_2.a.Trial
        int[]arr={1,2,3,4,5,6,7};
        //Look i used the arraySum() function from above class
        System.out.println(Trial.arraySum(arr));
    }
}

