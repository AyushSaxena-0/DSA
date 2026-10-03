public class O416Leetcode_503_Stacks_Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {

        //Just need to push all elements of array as for last element they are available
        //Then just repeat the NGE I code
        Stack<Integer>stack=new Stack<>();
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
}
