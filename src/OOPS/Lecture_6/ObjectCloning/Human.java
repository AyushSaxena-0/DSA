package OOPS.Lecture_6.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[]arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,5,6,9,1};
    }
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
    public Object clone() throws CloneNotSupportedException{
        //This is shallow copy
        return super.clone();
        //This would point to the same array it won't create independent array
        //Primitives would be copied
        //But reference variables would point to the same object
    }
    public Object deepClone() throws CloneNotSupportedException{
        Human twin = (Human)this.clone();//Shallow copy: primitives are copied, references are shared
        //Pointing twin to new array (As we want independent arrays for deep copy)
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            //Copying all elements of arr to twin
            twin.arr[i]=this.arr[i];
        }//returning twin
        return twin;
    }
}
