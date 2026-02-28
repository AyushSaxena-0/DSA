import java.util.Scanner;
import java.util.Arrays;
public class O35Arrays_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int [] arr=new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        //Alter to print arrays use for loop or enhanced for loop
//        for (int j : arr) {
//            System.out.print(j);
//        }
        //Creating an array of objects (non primitives)
        String[] xyz=new String[4];
        for (int i=0;i<xyz.length;i++){//Note here you can't use enhanced for loop as there iss no element in the array by default
            //So we are using normal for loop
            xyz[i]=sc.next();
        }
        //Arrays are mutable
        xyz[0]="ALAH";
        System.out.println(Arrays.toString(xyz));
    }
}
