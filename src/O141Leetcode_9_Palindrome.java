public class O141Leetcode_9_Palindrome {
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=-1234;
        System.out.println(isPalindrome(n));
    }
}
