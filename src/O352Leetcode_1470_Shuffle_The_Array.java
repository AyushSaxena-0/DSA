import java.util.Arrays;

public class O352Leetcode_1470_Shuffle_The_Array {
    public static int[] shuffle(int[] nums, int n) {
        //The array has even elements
        int first=0;
        int mid=n;
        int[]ans=new int[nums.length];
        //Taking two pointers in orignal array and adding at third pointer in third array
        int f=0;
        int s=n;
        int t=0;
        while(t<2*n){
            if(t%2==0){
                //Add elements from x
                ans[t++]=nums[f++];
            }
            else{
                ans[t++]=nums[s++];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
