import java.util.Arrays;

public class O189Merge_Sort {
    public static void mergeSort(int[]nums,int start,int end){
        //Solving by recursion

        //Stopping condition
        if(start==end)return;

        //Calculating the mid
        int mid=start+(end-start)/2;

        //Dividing the array into two parts recursively till size of each is 1
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);

        //Merging the cells
        merge(nums,start,mid,end);
    }
    //We need mid so that we can differentiate both arrays
    public static void merge(int[]nums,int start,int mid,int end){
        int[] sorted=new int[end-start+1];
        //Defining the pointers
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid&&j<=end){
            if(nums[i]>nums[j]){
                sorted[k++]=nums[j++];
            }
            else if(nums[i]<nums[j]){
                sorted[k++]=nums[i++];
            }
        }
        //Adding remaining elements of first array if elements were left
        while(i<=mid){
            sorted[k++]=nums[i++];
        }
        //Adding remaining elements of second array if elements were left
        while(j<=end){
            sorted[k++]=nums[j++];
        }
        //Copying these elements in the original array at the index used
        //So that no elements are lost
        //Or use Arrays.copyOfRange(arr,source,destination)
        //                              inclusive exclusive
        //Or use System.arraycopy(sorted,0,nums,start,sorted.length)
        for(int x=0;x<sorted.length;x++){
            nums[start+x]=sorted[x];
        }
    }
    public static void main(String[] args) {
        int[]nums={8,7,6,5,4,3,2,1};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
