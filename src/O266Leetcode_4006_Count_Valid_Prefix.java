public class O266Leetcode_4006_Count_Valid_Prefix {
    public static int countValidPrefixes(String s) {
        int zeros=0;
        int ones=0;
        int max=0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='0')zeros++;
            else ones++;
            //Note This is condition for alternating array
            if(Math.abs(zeros-ones)<2)max++;
        }
        return max;
    }

    static void main() {
        String s = "00110";
        System.out.println(countValidPrefixes(s));
    }
}
