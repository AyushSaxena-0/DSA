import java.util.Scanner;
public class O20Nested_Switch_Case {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID you want to check");
        int id=sc.nextInt();
        System.out.println("Enter department if id is 3,else type 0");
        String depart=sc.next();
//        switch(id){
//
//            case 1:
//                System.out.println("Employee 1");
//                break;
//            case 2:
//                System.out.println("Employee 2");
//                break;
//            case 3:
//                System.out.println("Employee 3");
//                switch(depart) {
//                    case "IT":
//                        System.out.println("High Scope");
//                        break;
//                    case "AI":
//                        System.out.println("Low Scope");
//                        break;
//                default:
//                    System.out.println("Wrong input");
//                }
//                break;
//            default:
//                System.out.println("Wrong input");
//        }

//Enhanced switch
        switch (id) {
            case 1 -> System.out.println("Employee 1");
            case 2 -> System.out.println("Employee 2");
            case 3 -> {
                System.out.println("Employee 3");
                switch (depart) {
                    case "IT" -> System.out.println("High Scope");
                    case "AI" -> System.out.println("Low Scope");
                    default -> System.out.println("Wrong input");
                }
            }
            default -> System.out.println("Wrong input");
        }

    }
}
