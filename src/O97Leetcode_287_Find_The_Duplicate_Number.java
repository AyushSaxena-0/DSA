class Solution {
    public static void swap(int[]arr,int i,int j){
        //I keep doing mistake in swap function
        //Do carefully
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void cycleSort(int[]nums){
        int i=0;
        while(i<nums.length){
            //Loop will always run till last index of array so always use i<nums.length
            if(nums[i]==i+1){
                //Case when element is sorted
                //At right location
                //Move forward
                i++;
            }
            else {
                //Correct index should be nums[i]-1 for wrong element at index i
                int correctindex=nums[i]-1;
                if(nums[i]!=nums[correctindex]){
                    //If duplicate is not present on correct location swap
                    //We check to avoid infinite loop of swapping duplicates at correct location
                    swap(nums,i,correctindex);
                }
                //If duplicate is present we move forward to other elements for sorting leaving it
                else{
                    i++;
                }

            }
        }
    }
    public static int findDuplicate(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            //First element nums[i]!=i+1 would be the duplicate so return it
            if(nums[i]!=i+1)return nums[i];
        }
        //Since its of int type we need a default return type
        //It is unreachable anyway
        return 0;
    }

    public static void main(String[] args) {
        int []arr={5,4,3,2,2,1};
        System.out.println(findDuplicate(arr));
    }
}