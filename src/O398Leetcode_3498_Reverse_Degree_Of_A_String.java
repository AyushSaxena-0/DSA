public class O398Leetcode_3498_Reverse_Degree_Of_A_String {
    public static int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            int x=s.charAt(i-1)-'a'+1;
            sum+=(27-x)*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s="aab";
        System.out.println(reverseDegree(s));
    }
}
