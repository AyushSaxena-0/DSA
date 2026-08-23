package Contest;

public class Check_ASCII_Palindrome {
        public static boolean isPalindrom_Check(String s){
            int l=0;
            int r=s.length()-1;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r))return false;
                l++;
                r--;
            }
            return true;
        }
        public static boolean isPalindromic(String s) {
            StringBuilder sb = new StringBuilder("");

            //Iterating through the characters and adding its ascii value in ans string
            for (int i = 0; i < s.length(); i++) {
                int x = s.charAt(i);
                //Now convert this to 8 bit binary string
                String x_string = Integer.toBinaryString(x);
                //Makeing it 8 bit exactly in case it is smaller
                while (x_string.length() < 8) {
                    x_string = "0" + x_string;
                }
                sb.append(x_string);
            }
            String ans = sb.toString();
            return isPalindrom_Check(ans);
        }

    public static void main(String[] args) {
        System.out.println(isPalindromic("a"));
    }
}
