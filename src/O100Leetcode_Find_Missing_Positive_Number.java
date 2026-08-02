import java.util.Arrays;

public class O100Leetcode_Find_Missing_Positive_Number {
        public static void swap(int[]nums,int i,int j){
            //Please dont do nums[j]=nums[i] you always do error
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void cyclicSort(int[]nums){
            int i=0;
            while(i<nums.length){
                //Checked negative and larger numbers
                //Larger numbers are of no importance so skip them
                if(nums[i]>nums.length||nums[i]<=0){
                    i++;
                }
                else{
                    int correctindex=nums[i]-1;
                    //Checking for duplicates and non sorted condition
                    if(nums[i]!=i+1 && nums[i]!=nums[correctindex]){
                        swap(nums,i,correctindex);
                    }
                    else{
                        //Handling duplication
                        //else ignore and move forward
                        i++;
                    }
                }
            }
        }
        public static int firstMissingPositive(int[] nums) {
            cyclicSort(nums);

            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    return i+1;
                }
            }

            //If all numbers are present return nums.length+1 {supposedly last number not in array}
            return nums.length+1;
        }
        //Alternative by sorting and then using condition
        public static int firstMissingPositive2(int[] nums) {
            int expected=1;
            Arrays.sort(nums);
            for(int num:nums){
                if(num<expected)continue;
                else if(num==expected)expected++;
                else{
                    return expected; //num>expected;
                }

            }
            return expected;
        }

    public static void main(String[] args) {
        int[]nums={-1,-1,2,3,4,5,5,6,7,8};
        System.out.println(firstMissingPositive(nums));
        System.out.println(firstMissingPositive2(nums));
    }
}

