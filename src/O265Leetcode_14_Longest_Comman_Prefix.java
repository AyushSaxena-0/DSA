public class O265Leetcode_14_Longest_Comman_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        //See if the string array is null or length is zero then no need to do anything return ""
        if(strs==null||strs.length==0)return "";
        //I pick first character of first string and iterate throght all the characters in that string
        //and for each character iterating in array it is simple brute force
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length()||ch!=strs[j].charAt(i))return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }

    static void main() {

        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
