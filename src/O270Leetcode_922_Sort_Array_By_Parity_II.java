import java.util.*;
public class O270Leetcode_922_Sort_Array_By_Parity_II {
    public static int[] sortArrayByParityII(int[] nums) {
        //I am creating two arraylist one of odd number
        //And another of even numbers
        //After that iterating in nums add adding odd numbers at odd index and vice versa
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)even.add(nums[i]);
            else{
                odd.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i%2==1&&!odd.isEmpty()){
                nums[i]=odd.remove(odd.size()-1);
            }
            else if(i%2==0&&!even.isEmpty()){
                nums[i]=even.remove(even.size()-1);
            }
        }
        return nums;
    }

    static void main() {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
}
