import java.util.Arrays;

public class O25Change_Value {
    static void changeVal(int[]arr){
        arr[0]=1000;
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        changeVal(arr);
        System.out.println(Arrays.toString(arr));
    //Modifies object i.e array
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" and "+b);
        //Doesnt modifies values
    }
}
