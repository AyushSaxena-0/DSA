package OOPS.Lecture_5_Part_2.Interface;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("CDPlayer start");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stop");
    }
}
