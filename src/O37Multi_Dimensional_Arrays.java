import java.util.Arrays;
import java.util.Scanner;
public class O37Multi_Dimensional_Arrays {
    public static void main(String[] args) {
//        //2D arrays are array of arrays
//        //Syntax int[][] arr=new int[3][];
//        // datatype [][] name=new datatype[rows][columns] column declaration is optional
//        //Observe number of rows are mandatory to declare
//        //But number of columns are not necessary to declare initially
//        int [][] arr={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9,10} //Note all rows need not to be of same length
//        };
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//            //Array in java is non continuous in nature
//        }

        //Taking input in 2D array
        int [][] arr=new int[3][];
        //Such arrays are called jagged arrays and we need to manually declare each row array
       //Otherwise null pointer error would come
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        for(int j=0;j<arr.length;j++){
//            for(int k=0;k<arr[j].length;k++){
//                System.out.print(arr[j][k]+"  ");
//            }
//            System.out.println();
//        }
        //Another way to output
        for(int i=0;i<arr.length;i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
    }
}

