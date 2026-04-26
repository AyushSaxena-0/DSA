public class O211Leetcode_392_Is_Subsequence_Two_Pointer_Approach_Concept {
    public static boolean isSubsequence(String s, String t) {
        int sl=s.length();
        int tl=t.length();

        if(sl>tl)return false;
        if(sl==0&&tl!=0)return true;
        if(sl==0&&tl==0)return true;
        if(tl==0)return false;
        //I am using 2 pointer approach

        int sp=0;
        int tp=0;

        while(tp<tl){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            if(sp==sl)return true;
            tp++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="abc";
        String t="adefbgjkfc";
        System.out.println(isSubsequence(s,t));
    }
}
