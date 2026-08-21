package OOPS.Lecture_3_Part_2;

public class Polymorphism {
    //Polymorphism = Poly + Morphism
    //Poly means many and morphism means ways to represent
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();

    }
}
