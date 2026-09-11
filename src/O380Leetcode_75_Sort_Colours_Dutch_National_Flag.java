import java.util.Arrays;

public class O380Leetcode_75_Sort_Colours_Dutch_National_Flag {
    public static void sortColors(int[] nums) {
        //Brute force consists of creating separate arraylist for 0,1,2 but optimaml approach is this
        //Count all zeros,ones and twos then just overwrite
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

    public static void main(String[] args) {
        int[]nums=new int[]{1,0,1,2,1,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
