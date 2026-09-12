import java.util.Arrays;

public class O380Leetcode_75_Sort_Colours_Dutch_National_Flag {
    public static void sortColors(int[] nums) {
        //Brute force consists of creating separate arraylist for 0,1,2 but optimaml approach is this
        //Count all zeros,ones and twos then just overwrite
        //Also known by name of Dutch National Flag
        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i:nums){
            if(i==0)zeros++;
            else if(i==1)ones++;
            else twos++;
        }
        //Now add zeros first in array then ones then twos
        for(int i=0;i<nums.length;i++){
            if(i<zeros){
                nums[i]=0;
            }//Indedx increment after 3 zeros if there are 4 ones then they would be from 3 till 7(excluded)
            else if(i<ones+zeros){
                nums[i]=1;
            }
            else nums[i]=2;
        }
    }
    //Alter make three pointers one starting from left having 0
    //One from right for 2
    //one mid moves from left=0 to right
    /*
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        //This does it in only one pass
        while(mid<=right){
            if(nums[mid]==0){
                //swap with left pointer and move left ahead by one
                swap(nums,mid,left);
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,right);
                right--;
            }
        }

    }
     */

    public static void main(String[] args) {
        int[]nums=new int[]{1,0,1,2,1,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
