import java.util.*;

public class O218Leetcode_17_Letter_Combination_Of_A_Phone_Number {
    public static List<String> helper(Map<Character,String> map, List<String>ans, String digits, String p){
        //Base Case for Recursion
        if(digits.isEmpty()){
            ans.add(p);
            // ans is shared across all recursive calls (same reference), so we modify it directly.
            // The return value is not used anywhere, so it's redundant.
            // IMPORTANT: recursion does NOT stop because of return.
            // It stops because no further recursive calls are made after base case.
            // return only exits the CURRENT function call (stack frame).

            return ans;
        }
        //Otherwise get string and iterate over it by recursion
        String str=map.get(digits.charAt(0));
        digits=digits.substring(1);
        for(int i=0;i<str.length();i++){
            helper(map,ans,digits,p+str.charAt(i));
        }
        return ans;
    }
    public static List<String> letterCombinations(String digits) {
        //Mapping all the values given in question
        Map<Character,String>map=Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
        //Calling recursive function for answer
        ArrayList ans=new ArrayList<>();
        return helper(map,ans,digits,"");
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
