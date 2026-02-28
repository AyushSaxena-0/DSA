public class O51Ceiling_Of_Number {
    //Ceiling of a number of means smallest number equal to or greater than the target number in array
    static int ceil(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        // Edge case: empty array
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // If target is greater than the greatest element
        if (target > arr[arr.length - 1]) {
            return -1;  // ceiling does not exist
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr={54,65,98,99,102,185,235,897};
        int target=103;
        System.out.println(ceil(arr,target));
    }

}
