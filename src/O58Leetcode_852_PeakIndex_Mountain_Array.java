public class O58Leetcode_852_PeakIndex_Mountain_Array {
    public static int peakindex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
                //Note arr in ascending part so move towards right
            }
            else{
                //We are in descending part so move towards left
                //Because this may be the answer so we check it
                end=mid;
            }
        }
        //In the end both the start and end point to same element
        //Hence it becomes the maximum one
        return start;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,19,6,3,1};
        System.out.println(peakindex(arr));
    }
}
