import java.util.Scanner;
public class O16Calculator {
    public static void main(String [] args){

        //Take input from user till user press X or x
        Scanner sc=new Scanner(System.in);
        while(true){

            System.out.println("Enter the operation to be performed");
            System.out.println("1 Addition");
            System.out.println("2 Substraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");

            char operation=sc.next().trim().charAt(0);
            if (Character.toLowerCase(operation)=='x'){
                return;
            }
            System.out.println("Enter the two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(operation=='1'){
                System.out.println(a+b);
            }
            else if(operation=='2'){
                System.out.println(a-b);
            }
            else if(operation=='3'){
                System.out.println(a*b);
            }
            else if (operation == '4') {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Division by zero not allowed");
                }
            }
            else{
                System.out.println("Invalid operation");
            }

        }

    }
}
