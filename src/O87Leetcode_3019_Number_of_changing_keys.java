public class O87Leetcode_3019_Number_of_changing_keys {
    public static int countKeyChanges(String s) {
        int count=0;
//        char[]keys=s.toLowerCase().toCharArray();
//        for(int i=1;i<keys.length;i++){
//            if(keys[i]!=keys[i-1]){
//                count++;
//            }
//Alter avoid creating an array and use toLowerCase() on s itself
// and save it in s and use s.charAt(i)!=s.charAt(i-1)

        s=s.toLowerCase();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="aAbB";
        System.out.println(countKeyChanges(s));
    }
}
