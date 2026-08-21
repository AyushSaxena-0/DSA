package OOPS.Lecture_3_Part_2;

public class Polymorphism {
    //Polymorphism = Poly + Morphism
    //Poly means many and morphism means ways to represent
    //All these circle,triangle etc are child of parent shapes
    //The parent class Shapes has method area but they also have same method area
    //So the method of child class overrides the parent class area method when called
    //Also observe we made different constructors with same name and different parameters
    //This is known as method overloading
    //Two types of polymorphism
    //1)Runtime Polymorphism (Method Overriding)
    //2)Compile Time Polymorphism (Method OverLoading) (also known as static polymorphism)

    //This is method overloading
    //Same name but different parameters/Ordering of diffrent types of parameter/Aguments could be diffrent

    static double sum(double a,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
    static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        //Try this
        Shapes shape1 = new Triangle();
        shape1.area();//It would print triangle area note this
        //Reference variable points to object of Triangle class

        shape.area();
        circle.area();
        square.area();
        triangle.area();
        //Look both functions are same named but have different parameters
        //a calls double a as typecasting of integer argument is already done
        //When appropriate parameter type in argument is not found
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
