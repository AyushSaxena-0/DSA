package OOPS.Lecture_6.CompairingObjects;

public class GenericClassImplementingInterface implements GenericInterface<Integer> {
    @Override
    public void display(Integer value) {
        System.out.println(value);
    }
}
