import java.util.*;

public class O244Leetcode_3016_Minimum_Number_Of_Presses_To_Type_Word {
    public static int minimumPushes(String word) {
        //Creating a Hashmap and storing freqency
        Map<Character,Integer> map=new HashMap<>();
        //Storing the Frequency
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //Storing frequency in arraylist
        List<Integer> list=new ArrayList<>(map.values());
        //Highest frequency first
        Collections.sort(list, Collections.reverseOrder());
        //Now calculating the answer
        int ans=0;

        for(int i=0;i<list.size();i++){
            //we are working on descending sorted array
            //[100,80,70,60,50,30,21,1]
            int press=(i/8)+1;  //As there are only 8 available buttons where pressing button once we get the character with the highest frequency
            ans=ans+list.get(i)*press;
        }
        return ans;
    }

    static void main() {
        System.out.println(minimumPushes("aabbccddeeffgghhii"));
    }
}
