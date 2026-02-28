//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class O54Leetcode_34_Find_First_and_Last_Position_Of_Elements_In_Sorted_Array {
    public static int firstoccurance(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int max=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]==target){
                max=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return max;
    }
    public static int lastoccurance(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int max=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]==target){
                max=mid;
                start=mid+1;
            }
            else{
                start=mid+1;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums={1,1,1,1,1,2,2,2,4,4,4,4,8,8,8};
        int target=2;
        int first=firstoccurance(nums,target);
        int last=lastoccurance(nums,target);
//Alter you can create a boolean variable find first to use same function for both cases by using anif else condition
        System.out.println(Arrays.toString(new int[]{first,last}));
    }
}
