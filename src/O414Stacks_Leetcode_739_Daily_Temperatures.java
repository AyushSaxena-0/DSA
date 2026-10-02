import java.util.Arrays;
import java.util.Stack;

public class O414Stacks_Leetcode_739_Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        //This is a variation of next greater element
        //I would need a result array
        int[]res=new int[temperatures.length];
        int n=res.length;
        res[n-1]=0;
        Stack<Integer>stack=new Stack<>();
        stack.push(n-1);
        //Now i am going pop the next smaller indexes
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty()&&temperatures[stack.peek()]<=temperatures[i]){
                //Pop the elements
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[]temperatures={71,72,72,73,76,78,99};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
