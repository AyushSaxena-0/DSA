import java.util.Arrays;

public class O41Swap_Numbers_Arrays {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7};
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[]arr,int i,int j){
        //Without using temp

        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
