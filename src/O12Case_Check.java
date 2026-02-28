import java.util.Scanner;
public class O12Case_Check {
    public static void main(String[] args){
            System.out.println("Enter the character to check whether uppercase or lower case :");
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().trim().charAt(0);
            if(ch>='a' && ch<='z'){
                System.out.println("Lowercase");
            }
            else if(ch>='A' && ch<='Z'){
                System.out.println("Uppercase");
            }
            else{
                System.out.println("Not a valid character");
            }

    }
}
