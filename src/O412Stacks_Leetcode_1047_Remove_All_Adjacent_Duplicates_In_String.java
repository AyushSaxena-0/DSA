import java.util.Stack;

public class O412Stacks_Leetcode_1047_Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDuplicates(String s) {
        //This question is very simple just use stack
        //Though to identify that this question is of stack it is hard

        //Start pushing from first index till last index and whenever you find repetaion just remove the top of stack and move index forward
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&stack.peek()==ch){
                //pop and move index forward
                stack.pop();
                continue;
            }
            //Otherwise push
            stack.push(ch);
        }
        //Now empty stack in a stringBuilder and return by converting to string
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }//Stack always reverses the element order so always reverse it
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s="abbacddcz";
        System.out.println(removeDuplicates(s));
    }
}
