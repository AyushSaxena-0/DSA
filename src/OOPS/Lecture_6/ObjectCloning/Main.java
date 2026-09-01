package OOPS.Lecture_6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal=new Human(23,"Kunal");
        //This would work to create a duplicate which is independent
        //However new keyword is very slow
        Human copy=new Human(kunal);
        copy.age=25;
        System.out.println(kunal.age);
        System.out.println(copy.age);
        //This is faster way
        //If you are using that can give exception inside function you need to declare it by throws keyword in the starting of function
        Human twin=(Human)kunal.clone();
        System.out.println(twin.name+"  "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
        //Now change first element of array look all object's array would change
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        //Shallow copy
        //This would point to the same array it won't create independent array
        //Primitives would be copied
        //But reference variables would point to the same object

    }
}
