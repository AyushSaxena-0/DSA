package OOPS.Lecture_5_Part_2.Interface;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate");
    }
}
