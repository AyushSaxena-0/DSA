import java.util.Scanner;
public class O11Largest_Of_Three_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the largest number");
        }
        else if (b > a && b > c) {
            System.out.println("B is the largest number");

    }
        else if (c > a && c > b) {
            System.out.println("C is the largest number");
        }

        //Alternative is using max function from Math class
        int max=Math.max(a,Math.max(b,c));
        System.out.println("The largest number is "+max);
    }
}
