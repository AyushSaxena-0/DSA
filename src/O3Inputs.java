import java.util.Scanner;
public class O3Inputs {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some input number");
        //Print integer
        int rollno=input.nextInt();
        input.nextLine();
        System.out.println("Your roll number is: "+ rollno);
        //Print string
        System.out.println("Enter your name :");
        String name=input.nextLine();
        System.out.println("Your name is : "+name);
        //Floating number
        System.out.println("Enter your age :");
        float age=input.nextFloat();
        System.out.println("Your age is : "+age);
    }
}
//When mixing Scanner methods:
//Situation	What to do
//nextInt() → nextLine()	add extra nextLine()
//nextLine() → nextInt()	no problem
//Multiple numbers	no issue
//String after number	buffer clear required
