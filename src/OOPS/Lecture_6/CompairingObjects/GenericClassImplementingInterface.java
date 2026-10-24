package OOPS.Lecture_6.CompairingObjects;

public class GenericClassImplementingInterface implements GenericInterface<Integer> {
    @Override
    public void display(Integer value) {
        //Do revise it kindly
        System.out.println(value);
    }
}
