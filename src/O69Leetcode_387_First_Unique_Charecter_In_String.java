import java.util.HashMap;

public class O69Leetcode_387_First_Unique_Charecter_In_String {

    public static int firstUniqChar(String s) {

        HashMap<Character,Integer> freq=new HashMap<>();
        char[]arr=s.toCharArray();
        if(arr.length==1)return 0;
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(freq.get(arr[i])==1)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
