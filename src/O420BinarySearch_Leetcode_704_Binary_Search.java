public class O420BinarySearch_Leetcode_704_Binary_Search {
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,7,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
}
