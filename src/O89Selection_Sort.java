import java.util.Arrays;

public class O89Selection_Sort {
    //Select the minimum element and keep it at its place
    public static int minele(int[]nums,int start,int end){
        int min=start;
        for(int i=start;i<=end;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        return min;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void selectionSort(int[] nums){
        //Selection search selects the minimum/maximum element and keep it at
        //First or last position (Depends on which version you are using)
        //Find max and keep it at last or find min and keep it at first
        //Time Complexity
        //Worst case O(N^2)
        //Best case O(N^2)
        //Not a stable sorting algorithm
        //Because look below example
        //Before sorting (5a), 3, (5b), 2
        //After sorting 2, 3, (5a), (5b)

        for(int i=0;i<nums.length-1;i++){
            int min=minele(nums,i,nums.length-1);
            //Note swap after finding minimum element in an iteration to avoid unnecessary swaps
                swap(nums,min,i);
        }
    }

    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
