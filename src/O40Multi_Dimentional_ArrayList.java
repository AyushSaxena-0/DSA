import java.util.ArrayList;
import java.util.Scanner;

class O40Multi_Dimentional_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Created a new Arraylist of Arraylist
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
        }
        //Added elements in Arraylist
        for(int i=0;i<10;i++){
            list.get(i).add(sc.nextLine());
        }
        System.out.println(list);
    }
}