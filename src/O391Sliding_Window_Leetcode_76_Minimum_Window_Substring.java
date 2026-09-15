public class O391Sliding_Window_Leetcode_76_Minimum_Window_Substring {
    public static boolean mapsEqual(int[]map,int[]mapt){
        for(int i=0;i<256;i++){
            //False condition is much simpler so rule it out
            if(map[i]<mapt[i])return false;
        }
        //Naturally this would be true
        return true;
    }
    public static String minWindow(String s, String t) {
        int[]map=new int[256];
        //Map all characters of string t
        int[]mapt=new int[256];
        for(int i=0;i<t.length();i++){
            mapt[t.charAt(i)]++;
        }
        //Now create a sliding window of variable length
        int low=0;
        int h=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        for(int high=0;high<s.length();high++){
            //Add high to frequency map
            map[s.charAt(high)]++;
            while(mapsEqual(map, mapt)){
                if(min>high-low+1){
                    min=high-low+1;
                    h=high;
                    l=low;
                }
                //Shrink window if the answer is correct as i want to find the smallest Substring
                map[s.charAt(low)]--;
                low++;
            }
        }
        return min==Integer.MAX_VALUE ? "":s.substring(l,h+1);
    }

    public static void main(String[] args) {
        String s="aaannnaaaaaa";
        String t="an";
        System.out.println(minWindow(s,t));
    }
}
