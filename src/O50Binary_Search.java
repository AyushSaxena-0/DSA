public class O50Binary_Search {
    //Works only in sorted array
    //Sorted order could be both ascending or descending
    //Time complexity worst case log N
    //Best case time complexity O(1)
    //Average case time complexity O(log N)

    //Where to apply Binary search ?
    //Wherever you find sorted array try thinking of binary search
    //Learn this kunal said this



    static int binarysearch(int[]arr,int target){
        //Only for ascending order
    int start=0;
    int end=arr.length-1;
    if(arr==null || arr.length==0){
        return -1;
    }
    while(start<=end){
        //we do it instead (start+end)/2 because it might overflow the values of integer for very large values of start and end
        //Intelligently we write end-start as there differance will always be less than both of them
        //Thus we do not face the problem of exceeding ineteger range
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
    return -1;
    }
    static int binarysearch2(int[] arr,int target,int start,int end){
       //Binary search in range
        if(arr==null || arr.length==0){
            return -1;
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
        return -1;
    }
    static int binarysearch3(int[] arr,int target){
        //Only for Descending order sorted array
        int start=0;
        int end=arr.length-1;
        if(arr==null || arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarysearch4(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        //We take first and last number for comparison as first two number could be same so nothing can be said
        //If it is increasing or decreasing then either first and last are different or all the numbers are same
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (asc) {
                if (arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        System.out.println(binarysearch(arr,target));
        System.out.println(binarysearch2(arr,target,0,arr.length-1));
        int[] des={10,9,8,7,6,5,4,3,2,1};
        int t2=9;
        System.out.println(binarysearch3(des,t2));
        System.out.println(binarysearch4(des,t2,0,des.length-1));
    }
}
