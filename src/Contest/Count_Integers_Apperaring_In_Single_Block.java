package Contest;

import java.util.ArrayList;
import java.util.List;

public class Count_Integers_Apperaring_In_Single_Block {
    public static int countSpecialIntegers(int[] nums) {
        if(nums.length==1)return 1;
        //I think i need to use ArrayList indexOf() and lastIndexOf() method
        //Also i need to usue two pointer method
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        //Now use two pointer method to find continious block boundry and check by lastIndexof() method of ArrayList
        int left=0;
        int count=0;
        while(left<nums.length){
            int right=left+1;
            //We searched till this right is equal to right -1 index value
            while(right<nums.length&&nums[right]==nums[right-1])right++;
            //My window is from left to right-1
            //Check all elements value in this occurance
            //First occurace
            int first=list.indexOf(nums[left]);
            //Last occurance
            int last=list.lastIndexOf(nums[left]);
            //We did what question asked in every sequence checked left one
            if(first==left&&last==right-1)count++;
            left=right;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSpecialIntegers(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
