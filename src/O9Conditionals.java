import java.util.Scanner;
public class O9Conditionals {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your salary");
    double salary=sc.nextDouble();
    if(salary>=360000 && salary<600000){
        System.out.println("You are Rich");
    }
    else if(salary>=600000 && salary<1000000){
        System.out.println("You are super rich");
    }
    else{
        System.out.println("You are poor Engineer");
    }
    }
}
