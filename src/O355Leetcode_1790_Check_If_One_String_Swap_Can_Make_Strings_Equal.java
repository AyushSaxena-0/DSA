public class O355Leetcode_1790_Check_If_One_String_Swap_Can_Make_Strings_Equal {
    public static boolean areAlmostEqual(String s1, String s2) {

        //See if both string's length are not equal then anyway you cannot make them equal
        if(s1.length()!=s2.length())return false;
        //Now if there are more than two non equal alphabets then also swapping won't make them equal
        int notEqual=0;

        int first=0;
        int second=0;
        int third=0;
        int fourth=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(notEqual==0){
                    first=s1.charAt(i);
                    second=s2.charAt(i);
                }
                if(notEqual==1){
                    third=s1.charAt(i);
                    fourth=s2.charAt(i);
                }
                notEqual++;
            }
            if(notEqual>=3)return false;
        }
        if(notEqual==0)return true;
        return (first==fourth)&&(second==third);
    }

    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="hbcdefga";
        System.out.println(areAlmostEqual(s1,s2));
    }
}
