public class O419BinarySearch_GFG_Ceil_In_Sorted_Array {
    public static int findCeil(int[] arr, int x) {
        // code here
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]<x){
                start=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7,9,78,79,100};
        System.out.println(findCeil(arr,9));
    }
}
