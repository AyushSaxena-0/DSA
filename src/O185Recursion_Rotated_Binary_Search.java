public class O185Recursion_Rotated_Binary_Search {
    //I have to solve Rotated Binary Search by using Recursion
    //Check if left side is sorted then search in left half
    //Check if right side is sorted then search in right half

    static int bSearch(int[]nums,int target,int start,int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        //if nums[mid]==target then return mid
        if (nums[mid] == target) return mid;

        //if left side is sorted search in this part
        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target < nums[mid]) {
                return bSearch(nums, target, start, mid - 1);
            }
            return bSearch(nums, target, mid + 1, end);
        }
        //Check if right side is sorted,search in that part
        else {
            if (target > nums[mid] && target <= nums[end]) {
                return bSearch(nums, target, mid + 1, end);
            } else {
                return bSearch(nums, target, start, mid - 1);
            }
        }
    }

    static int bSearch2(int[]nums,int target,int start,int end){
        //Kunal Kushwaha's approach
        if(start>end)return -1;

        int mid=start+(end-start)/2;

        if(nums[mid]==target)return mid;

        //searching the left hand side
        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<nums[mid]){
                return bSearch2(nums, target, start, mid - 1);
            }
            else{
                return bSearch2(nums, target, mid + 1, end);
            }
        }

        //Searching the other half
        if(target > nums[mid] && target <= nums[end]){
            return bSearch2(nums,target,mid+1,end);
        }

        return bSearch2(nums,target,start,mid-1);
    }

    public static void main(String[] args) {
        int[]nums={5,6,7,8,1,2,3,4};

        System.out.println(bSearch(nums,6,0,nums.length-1));
        System.out.println(bSearch2(nums,6,0,nums.length-1));
    }
}