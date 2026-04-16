import java.util.Arrays;

public class O195Recursion_MergeSort_Without_InPlace {
    //Alter use int[] left=Arrays.copyOfRange(nums,start,mid)
    //          int[] right=Arrays.copyOfRange(nums,mid,arr.length);
    //in above arrays.copyofrange function the exit boundary is exclusive of element
    static int[] mergeSort(int[]nums,int start,int end){
        if (start == end) {
            return new int[]{nums[start]};
        }
        //Calculating the mid
        int mid=start+(end-start)/2;
        //Calculating left array
        int[]left=mergeSort(nums,start,mid);
        //Calculating right array
        int[]right=mergeSort(nums,mid+1,end);

        return merge(left,right);
    }
    static int[]merge(int[]left,int[]right){


        int[]sorted=new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                sorted[k++]=left[i++];
            }
            else{
                sorted[k++]=right[j++];
            }
        }
        while(i<left.length){
            sorted[k++]=left[i++];
        }
        while(j<right.length){
            sorted[k++]=right[j++];
        }
        return sorted;
    }
    //Time Complexity
    //Since at every level N elements are merged
    //And there are total Log N level
    //So the time complexity becomes O(N*LogN)
    public static void main(String[] args) {
        int[]nums={6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(nums,0,nums.length-1)));
    }
}
