package OOPS.Lecture_5_Part_2.Interface;

    public class Car implements Engine,Brake,Media{

        //It really fixed the problem of multiple inheritance
        //Which class method to use after object is created of a class who's both subclasses contain same method
        //Here since we are overriding both methods thus it does not matter which parent interface function is used
        @Override
        public void brake() {
            System.out.println("I brake really Hard");
        }

        @Override
        public void start() {
            System.out.println("I start really loudly");
        }

        @Override
        public void stop() {
            System.out.println("I stop really abruptly");
        }

        @Override
        public void acc() {
            System.out.println("I accelerate like hell fast");
        }
    }
