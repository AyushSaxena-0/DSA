public class O60Leetcode_33_Rotated_Sorted_Array {
    //Note in this solution the direction of rotation is irrelevant
    //This solution work for both Left and Right rotation

    public static int pivot(int[]nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            //To avoid IndexOfRange Error
            //We have mid<end (as we are checking mid+1
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            //To avoid IndexOfRange Error
            //We have mid>start (as we are checking mid+1
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //These both below are normal Binary search conditions
            else if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                //nums[start]<nums[mid]
                //We are in sorted part of array
                start=mid+1;
            }

        }
        return -1;
    }
    public static int pivotWithRepetition(int[]nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                //check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) return start;
                start++;
                //check if end is pivot
                if (end > start && nums[end] < nums[end - 1]) return end - 1;
                end--;
                //Because otherwise the old start and end index are used for index calculation
                //the conditions won't make sense otherwise
                continue;
            }

            //To avoid IndexOfRange Error
            //We have mid<end (as we are checking mid+1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            //To avoid IndexOfRange Error
            //We have mid>start (as we are checking mid+1
            else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }//Conditions for loop to move //Pivot is to the right so we use nums[mid]>nums[end]
            //Left side is sorted so we should move towards the right
            else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{

                end=mid-1;
            }
        }
        return -1;
    }
    public static int bs(int[] nums,int target,int start,int end){
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

    public static int search(int[] nums, int target) {
        int peak = pivot(nums);

// case 1: array is not rotated
        if (peak == -1) {
            return bs(nums, target, 0, nums.length - 1);
        }

// case 2: search left half
        int left = bs(nums, target, 0, peak);
        if (left != -1) {
            return left;
        }

// case 3: search right half
        return bs(nums, target, peak + 1, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums={6,7,8,9,0,1,2,3,4,5};
        int target=3;
        System.out.println(search(nums,target));
        int[]nums2={2,9,2,2,2};
        System.out.println(pivotWithRepetition(nums2));
    }
}
