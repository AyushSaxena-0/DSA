import java.util.*;
public class O158Leetcode_13_Roman_To_Integer {
        public static int romanToInt(String s) {
            //Creating a hashmap
            Map<Character,Integer>map=new HashMap<>();
            //Add all the roman numerals and with their values
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int value=0;
            //Iterating the String
            for(int i=0;i<s.length();i++){
                int current=map.get(s.charAt(i));
                if(i+1<s.length() && current<map.get(s.charAt(i+1))){
                    //We are just substracting current value otherwise if we do add (next-current) it would cause next to add twice
                    value=value-current;
                }
                else{
                    value=value+map.get(s.charAt(i));
                }
            }

            return value;
        }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

}
