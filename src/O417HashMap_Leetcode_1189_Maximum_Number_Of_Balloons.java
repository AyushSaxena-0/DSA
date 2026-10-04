import java.util.HashMap;
import java.util.Map;

public class O417HashMap_Leetcode_1189_Maximum_Number_Of_Balloons {
    public static int maxNumberOfBalloons(String s) {
        //Create a hashmap then find min frequency in letters b,a,l,o,o,n,s
        //Since o is repeated then freq/2 should be considered
        Map<Character,Integer> map=new HashMap<>();
        //Create a hashmap with frequency
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String req="balon";
        //Now find minimum freq of each character
        int minFreq=Integer.MAX_VALUE;
        for(int i=0;i<req.length();i++){
            if(!map.containsKey(req.charAt(i)))return 0;
            if(req.charAt(i)=='o'||req.charAt(i)=='l'){
                minFreq=Math.min(minFreq,map.get(req.charAt(i))/2);
            }
            else{
                minFreq=Math.min(minFreq,map.get(req.charAt(i)));
            }
        }
        return minFreq;
    }

    public static void main(String[] args) {
        String s="bbaalllloooonn";
        System.out.println(maxNumberOfBalloons(s));
    }
}
