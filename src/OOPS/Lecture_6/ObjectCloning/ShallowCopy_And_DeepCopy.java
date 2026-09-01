package OOPS.Lecture_6.ObjectCloning;

import java.util.Arrays;

public class ShallowCopy_And_DeepCopy {
    // Shallow copy
// Creates a new object, but reference variables inside it still point
// to the same referenced objects.
// Primitive values are copied.
// Therefore, modifying a shared mutable object affects both objects.

    // Deep copy
// Creates a new object and independent copies of its mutable referenced objects.
// Therefore, modifications to the original's mutable objects do not affect the copy.
    public static void main(String[] args)throws CloneNotSupportedException {

        Human one = new Human(23, "one");
        Human two =   (Human) one.clone();//(Human) is used for typecasting object returned from one.clone() to human type
        Human three = (Human) one.clone();//one.clone() returns an object and not human so we type cast it
        System.out.println(Arrays.toString(two.arr));
        Human four = (Human) three.deepClone();
        one.arr[0]=100;
        //Shallow copy (Modified due to both one and two pointing to same arr)
        System.out.println(Arrays.toString(two.arr));
        //Deep copy (No modification)
        System.out.println(Arrays.toString(four.arr));

    }

}
