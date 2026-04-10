import java.util.Arrays;

public class O180Recursion_Sort_Array_Bubble_Sort {
    static void helper(int[]arr,int start,int end){
        if(end==0)return;
        if(start<end){
            if(arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            helper(arr,start+1,end);
        }
        else{
            helper(arr,0,end-1);
        }
    }
    static void bubbleSort(int[]arr){
        helper(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        int start=0;
        int end=arr.length-1;
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
