import java.util.HashMap;
import java.util.Stack;

public class O413Stacks_Leetcode_20_Valid_Parentheses {
    public static boolean isValid(String s) {
        if(s.length()%2==1)return false;
        //Push only opening brackets you cannot push } and then { those won't cancel
        //So it is best to not push } and return false
        HashMap<Character,Character> map=new HashMap<>();

        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()||map.get(stack.peek())!=ch)return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
}
