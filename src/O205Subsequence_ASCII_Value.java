import java.util.ArrayList;

public class O205Subsequence_ASCII_Value {
    public static ArrayList<String>subAs(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        //Skip
        ArrayList<String>left=subAs(str.substring(1),ans);
        //Pick
        char ch=str.charAt(0);
        ArrayList<String>right=subAs(str.substring(1),ans+ch);
        //ASCII value                                             Or use (int)ch for ASCII Value
        ArrayList<String> middle=subAs(str.substring(1),ans+(ch+0));

        left.addAll(right);
        left.addAll(middle);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(subAs("abc",""));
    }
}
