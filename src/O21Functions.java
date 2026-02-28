import java.util.Scanner;
public class O21Functions {
    static void sum (){
        System.out.println("Enter two numbers whose sum you want");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        //Functions are used for reducing the length of code by using reusable lines of code without needing to write them again and again
        //Function in a class is known as method
        //Notice that I smartly kept the process of taking input and output printing in the function itself
        //This is done to avoid Repetition of code
        //Remember --> D.R.Y Do Not Repeat Yourself
        sum();
        sum();
    }
}