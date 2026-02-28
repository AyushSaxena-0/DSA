import java.util.ArrayList;
import java.util.List;

public class O81Leetcode_2947_Find_Words_Containing_Character {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            /*for(char ch:word.toCharArray()){
                if(ch==x && answer.contains(i)==false) {
                    answer.add(i);
                    }
            }
        }
        //Alter use words[i].indexOf(x) != -1*/
            if(words[i].indexOf(x)!=-1){
                answer.add(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr= {"leet","code","Ayush","Saxena"};
        char x='e';
        System.out.println(findWordsContaining(arr,x));
    }
}
