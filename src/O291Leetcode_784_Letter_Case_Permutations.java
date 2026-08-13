import java.util.ArrayList;
import java.util.List;

public class O291Leetcode_784_Letter_Case_Permutations {
    public static void helper(List<String>list,String up,String p){
        //Now i am going for base case
        //It is when unprosessed become empty
        if(up.isEmpty()){
            if(!list.contains(p)){
                list.add(p);
            }
            return;
        }
        char ch=up.charAt(0);
        while(up.length()>1&&Character.isDigit(ch)){
            p=p+ch;
            //Unprocessed should also be changed
            up=up.substring(1);
            ch=up.charAt(0);
        }
        //Now i am at Character
        //UpperCase
        helper(list,up.substring(1),p+Character.toUpperCase(ch));
        //LowerCase
        helper(list,up.substring(1),p+Character.toLowerCase(ch));
    }
    public static List<String> letterCasePermutation(String s) {
        List<String>list=new ArrayList<>();
        helper(list,s,"");
        return list;
    }

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }
}
