public class O73Leetcode_2108_Find_First_Plalindromic_String_In_Array {
    public static boolean checkpallindrome(String[] words,int i){
        char[] sample=words[i].toCharArray();
        int start=0;
        int end=sample.length-1;
        while(start<=end){
            if(sample[start]==sample[end]){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<=words.length-1;i++){
            if(checkpallindrome(words,i)==true)return words[i];
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words));
    }

}
