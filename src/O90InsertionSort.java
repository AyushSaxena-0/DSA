import java.util.Arrays;

public class O90InsertionSort {
    //In insertion sort the element goes at its correct location index
    //All the smaller elements goes to left
    //And larger element goes to right
    //For every index put the element at the correct index at its left
    public static void swap(int[]arr,int i, int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    //Time complexity
    //Worst case=O(N^2)
    //Best case=O(N)
    //It is a Stable sort algorithm
    public static void insertionSort(int[] arr){
     for (int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0 && arr[j]>arr[j-1]){
            //Or use a for loop from j=i+1 till j>0 and do j--
                  swap(arr,j,i);
                  j--;
            }
     }
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
