public class O142Leetcode_125_Palindrome {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            // skipping non-alphanumeric
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
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
        String s="A  man nama";
        System.out.println(isPalindrome(s));
    }
}
