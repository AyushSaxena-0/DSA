public class O166Leetcode_35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
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
        return end+1;
    }

    public static void main(String[] args) {
        int []nums={1,3,4,5};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }
}
