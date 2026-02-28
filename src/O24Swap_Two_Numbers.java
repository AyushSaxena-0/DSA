import java.util.Scanner;
public class O24Swap_Two_Numbers {
    //Swapping two numbers cannot be directly done by function as pass by value is there
    //Java does not support pointers directly; it uses references and passes everything by value.

    public static void main(String[] args) {
        System.out.println("Enter the numbers to be replaced");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" and "+b);

    }

}
