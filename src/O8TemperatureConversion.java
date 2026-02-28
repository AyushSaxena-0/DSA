import java.util.Scanner;
public class O8TemperatureConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: C");
        float c=sc.nextFloat();
        float faren=(9* c/5)+32;
        System.out.println("farenheight :"+faren);
    }
}
