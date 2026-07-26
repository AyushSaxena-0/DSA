public class O233Leetcode_2947_Count_Beautiful_Substring_1 {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int beautifulSubstrings(String s, int k) {
        //Creating an array of all substring of String s
        int n=s.length();
        int m=0;
        int ans=0;

        for (int i = 0; i < n; i++) {
            int vowels = 0;
            int consonants = 0;
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;

                if (vowels == consonants && (vowels * consonants) % k == 0)
                    ans++;
            }
        }
        return ans;
    }

    static void main() {
        String s = "aabb";
        int k = 2;
        System.out.println(beautifulSubstrings(s, k));
    }
}
