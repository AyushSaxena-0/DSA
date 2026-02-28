public class O56GFG_Infinite_Array {
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return -1;
    }
    static int infinite(int[]arr,int target){
        int start=0;
        int end=1;
        while(end<target && end<arr.length){
            int newstart=end;
            //Alternative you can take size as end-start+1 and multiply by 2 to add at start for next window
            end=end*2;
            start=newstart;
        }
    return binarysearch(arr,target,start,Math.min(end,arr.length));
    }
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int target=19;
    System.out.println(infinite(arr,target));
    }
}
