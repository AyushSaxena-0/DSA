import java.util.Scanner;
public class O17Switch_Case {

    public static void main(String[] args){

//        //Switch case
//
//        Scanner sc=new Scanner(System.in);
//        String fruit=sc.next();
//        if(fruit.equals("mango")){
//            //Note we don't use fruit=="mango" because it checks whether fruit points to mango object, remember kunal could be called by multiple referance names like baby , son , brother
//            //it is case sensitive
//            System.out.println("King of fruits");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("A sweet red fruit");
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
//Press alt + enter on switch to change normal switch to enhanced switch
        switch (fruit) {
            case "apple" -> System.out.println("apple");
            case "orange" -> System.out.println("orange");
            case "pear" -> System.out.println("pear");
            default -> System.out.println("Wrong input");
        }

    }


}
