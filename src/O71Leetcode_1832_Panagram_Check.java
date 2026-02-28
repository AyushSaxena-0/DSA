public class O71Leetcode_1832_Panagram_Check {
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
// Notice s.indexOf(ch) give index of character ch in string s
// sentence.indexOf(ch) returns the index of the first occurrence of ch, or -1 if ch is not present
        for(char ch='a'; ch<='z'; ch++){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
    //Otherwise solve by using set and use return set.size==26;

    public static void main(String[] args) {
        String s="HELLOWORLDisansdnfihjcjcbmzxcvbnmasdfghjklkqwertyuiop,,lmjjhhygvtfcdeswsdfghjkjhcxcvb";
        System.out.println(checkIfPangram(s));
    }
}
