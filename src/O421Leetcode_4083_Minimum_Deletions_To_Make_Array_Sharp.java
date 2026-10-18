import java.util.Stack;

public class O421Leetcode_4083_Minimum_Deletions_To_Make_Array_Sharp {
    public static int minDeletions(int[] nums) {
        //I tried stack as the element space was changing with every move so i cant solve by simple array
        //Lets try stack
        Stack<Integer> stack=new Stack<>();
        //Push each element in the stack
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!stack.isEmpty()){
                if(stack.peek()==nums[i]){
                    stack.pop();
                    count++;
                }
            }
            stack.push(nums[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums={1,1,2,2,2,3};
        System.out.println(minDeletions(nums));
    }
}
