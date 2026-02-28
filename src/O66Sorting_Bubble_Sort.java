import java.util.Arrays;

public class O66Sorting_Bubble_Sort {
//Works only if both are not equal and integer are small , otherwise may overflow so use temp to swap
//    public static void swap(int[] arr,int i,int j){
//        arr[i]=arr[i]+arr[j];
//        arr[j]=arr[i]-arr[j];
//        arr[i]=arr[i]-arr[j];
//    }

    //It is also known as Sinking sort or Exchange Sort
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    //Space complexity is constant
    //No extra space is required like copying the array etc
    //Known as Inplace sorting algorithms (No new array is created)
    //Time Complexity
    //Best Case ->O(N)
    //Worst Case ->O(N^2)
    //It is stable sort algorithm
    //Stable sort algorithm means relative order of two same elements remain same
    //for ex 1,2,3(first),3(second),4 remains same after sorting and before sorting
    public static void bubblesort(int[]arr) {
//My version does one less comparison than kunal and thus is slightly better
        for (int pass = 0; pass < arr.length-1 ; pass++) {
            boolean swapped=false;
            for (int i = 0; i < arr.length - pass -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }

            }
            if(!swapped)break;// !false=true
        }
    }
    public static void main(String[] args) {
        int[]arr={-2,-1,-32,0};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

