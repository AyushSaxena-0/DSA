public class O162Leetcode_2839_Check_If_Strings_Could_Be_Made_Equal {
    public static boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] even = new int[26];
        int[] odd = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int x : even) if (x != 0) return false;
        for (int x : odd) if (x != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd", "cbad")); // true
    }
}
