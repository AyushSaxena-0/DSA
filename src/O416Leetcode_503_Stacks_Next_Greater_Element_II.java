import java.util.Arrays;
import java.util.Stack;

public class O416Leetcode_503_Stacks_Next_Greater_Element_II {
    public static int[] nextGreaterElements(int[] nums) {

        //Just need to push all elements of array as for last element they are available
        //Then just repeat the NGE I code
        Stack<Integer> stack=new Stack<>();
        int[]res=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            stack.push(nums[i]);
        }
        //Now next greater element code
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }
    //Alter is iterate array two times
    public static void main(String[] args) {
        int[]nums={6,11,3,4,5};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
