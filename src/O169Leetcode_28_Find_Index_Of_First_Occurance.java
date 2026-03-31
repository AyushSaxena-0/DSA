public class O169Leetcode_28_Find_Index_Of_First_Occurance {
    public static int strStr(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public static void main(String[] args) {
        String s1="Ayush Saxena";
        String s2="Saxena";
        System.out.println(strStr(s1,s2));
    }
}
