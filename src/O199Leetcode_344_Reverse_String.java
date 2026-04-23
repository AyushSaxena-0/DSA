public class O199Leetcode_344_Reverse_String {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[]s={'A','Y','U','S','H'};
        reverseString(s);
        System.out.println(s);
    }
}
