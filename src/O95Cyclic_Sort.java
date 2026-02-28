import java.util.Arrays;

public class O95Cyclic_Sort {
    //When to apply when given in question numbers from 1 to N
    //Cyclic sort
    //Worst case swaps become N-1 (Sorting N-1 automatically sorts N elements) +N(Checking last time if they are sorted or not)
    //Total=(2N-1)  {N-1 + N}
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void cyclicSort(int[] arr){
        int index=0;
        while(index<arr.length){
            if(index!=arr[index]-1){
                swap(arr,index,arr[index]-1);
            }
            else{
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
