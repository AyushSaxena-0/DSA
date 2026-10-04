import java.util.HashMap;
import java.util.Map;

public class O418HashMap_Leetcode_383_Ransom_Note {
    public static boolean canConstruct(String ransomeNote, String magazine) {
        //Create two hashmaps to store available numebr of characters
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
        //Fill Both hashmaps
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomeNote.length();i++){
            char ch=ransomeNote.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        //Now iterate through ransomeNote and check below conditions
        for(int i=0;i<ransomeNote.length();i++){
            char ch=ransomeNote.charAt(i);
            //RansomeNote<=magazine
            if(!map1.containsKey(ch))return false;
            if(map2.get(ch)>map1.get(ch))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String  ransomeNote="cba";
        String magazine="bbc";
        System.out.println(canConstruct(ransomeNote,magazine));
    }
}
