import java.util.Scanner;
public class O19Weekday_Weekend {
    public static void main(String [] args){

        System.out.println("Enter the day you want to check");
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine().strip();
//        switch(day){
//
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("Weekday");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Wrong input");
//
//        }
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Wrong input");
        }



    }
}
