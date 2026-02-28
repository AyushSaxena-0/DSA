
public class O83Leetcode_2114_Max_words_in_sentance {
    public static int mostWordsFound(String[] sentences) {
        int maxwords=0;
        for(String s:sentences){
            //trim() removes whitespaces
            //split(argument string) splits string with (argument string like " " or "," etc)
            //split("\\s+") \\s+ removes more than one spaces if present between words
            int words=s.trim().split("\\s+").length;
            if(maxwords<words){
                maxwords=words;
            }
        }
        return maxwords;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
