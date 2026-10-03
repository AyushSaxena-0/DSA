import java.util.Stack;

public class O415Stacks_Leetcode_1209_Remove_All_Adjacent_In_String_II {
    public static String removeDuplicates(String s, int k) {
        //Note here array could be kept in stack with two indexes first telling the character
        //Second index for number of times this is together
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()||(stack.peek()[0])!=s.charAt(i)){
                stack.push(new int[]{s.charAt(i),1});
            }
            else{
                if(stack.peek()[1]==k-1){
                    stack.pop();
                    continue;
                }
                else{
                    int[]x=stack.pop();
                    x[1]+=1;
                    stack.push(x);
                }
            }
        }
        //Now build the string by using the stack
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            int[]x=stack.pop();
            while(x[1]!=0){
                sb.append((char)x[0]);
                x[1]--;
            }
        }//The answer would be reversed as strings are also reversed when we pop them after putting them in stack
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        System.out.println(removeDuplicates(s,3));
    }
}
