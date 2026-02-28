public class O61GFG_Rotation_count_in_sorted_array {
//Use formulae rotation K=pivot +1 (As index start from 0)
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
                // Note nums[mid]<nums[mid-1] case is already taken care before so it would be caught later
                start=mid+1;
            }
            else{
            // Note nums[mid]>nums[mid+1] case is already taken care before so it would be caught later
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={7,7,8,9,1,2,3,4,5,6};
        int pivot=pivotWithRepetition(nums);
        //It is the formulae that number of elements rotated is one mote than pivot index as index start from 0
        //Rotated=pivot+1
        //If index is 0 then array is not rotated at all
        System.out.println(pivot+1);
    }

}
