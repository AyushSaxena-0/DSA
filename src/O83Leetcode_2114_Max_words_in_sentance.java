
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
    //Alternative count the number of spaces in each string of String array
    public static int maxWords(String s){
        //Number of words=Number of spaces + 1
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')count++;
        }
        return count;
    }
    public static int mostWordsFound2(String[] sentences) {
        int ans=0;
        int words=0;
        for(String s : sentences){
            words=maxWords(s);
            if(words>ans)ans=words;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
        System.out.println(mostWordsFound2(sentences));
    }
}
