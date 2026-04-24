public class O206Leetcode_58_Length_Of_Last_Word {
    public static int lengthOfLastWord(String s) {
        int len=0;
        int end=s.length()-1;
        //This one i learned from linked in
        //Note we are starting from right and moving towards left ignoring spaces in first loop without increasing count and then after reaching word we are moving increasing count thus giving us word length as it stops when it encounters space
        while((end>=0) && (s.charAt(end)==' '))end--;
        while((end>=0) && (s.charAt(end)!=' ')){
            len++;
            end--;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
