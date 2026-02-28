import java.util.Arrays;

public class O43Reverse_Array {
    static void swap(int[]arr,int i,int j){
        //Without using temp
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    static void reverse(int[]arr){

        int start=0;
        int end=arr.length-1;
        //Note we don't overwrite because in swapping odd index would become 0
        //Addition–subtraction swap fails when both variables refer to the same memory location because the original value is overwritten
        while(start<end){
        swap(arr,start,end);
        start++;
        end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

}
